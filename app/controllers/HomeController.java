package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import views.html.*;

public class HomeController extends Controller {

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }

    public Result index() {
        return ok(index.render(getUserFromSession()));
    }

    public Result products(Long cat) {
        List<Product> productsList = new ArrayList<Product>();
        List<Category> categoriesList = Category.findAll();

        if(cat == 0){
            productsList = Product.findAll();
        }else{
            productsList = Category.find.ref(cat).getProducts();
        }


        return ok(products.render(productsList,categoriesList, getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteProduct(Long id) {
        Product.find.ref(id).delete();

        flash("success", "Product has been deleted");

        return redirect(controllers.routes.HomeController.products());
    }


    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addProduct() {
        Form<Product> addProductForm = formFactory.form(Product.class);
        return ok(addProduct.render(addProductForm, getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addProductSubmit() {
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        if (newProductForm.hasErrors()) {
            return badRequest(addProduct.render(newProductForm, getUserFromSession()));
        }

        Product p = newProductForm.get();

        if (p.getId() == null) {
            p.save();
        } else if (p.getId() != null) {
            p.update();
        }

        flash("success", "Product " + p.getName() + " has been created/updated");

        return redirect(controllers.routes.HomeController.products());
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateProduct(Long id) {

        Product p;
        Form<Product> productForm;

        try {
            p = Product.find.byId(id);

            productForm = formFactory.form(Product.class).fill(p);
        } catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addProduct.render(productForm, getUserFromSession()));

    }

    private User getUserFromSession() {
        return User.getUserById(session().get("email"));
    }

}
