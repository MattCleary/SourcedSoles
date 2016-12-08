package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import models.*;
import views.html.*;

public class HomeController extends Controller {

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f){
        this.formFactory = f;
    }


    public Result index() {
        return ok(index.render());
    }

    public Result products(){

        List<Product> productsList = Product.findAll();
        return ok(products.render(productsList));
    }

    public Result addProduct(){

        Form<Product> addProductForm = formFactory.form(Product.class);

      return ok(addProduct.render(addProductForm));
    }

    public Result addProductSubmit(){

        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        if(newProductForm.hasErrors()){

            return badRequest(addProduct.render(newProductForm));
        }

        Product newProduct = newProductForm.get();

        newProduct.save();

        flash("success", "Product " + newProduct.getName() + " has been created");

        return redirect(controllers.routes.HomeController.products());
    }

    public Result deleteProduct(Long id){

        Product.find.ref(id).delete();

        flash("success", "Product has been deleted");

        return redirect(routes.HomeController.products());
    }

}
