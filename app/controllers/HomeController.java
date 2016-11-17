package controllers;

import play.mvc.*;

import views.html.*;

public class HomeController extends Controller {


    public Result index() {
        return ok(index.render());
    }

    public Result products(){
        return ok(products.render());
    }

    public Result productsPage(){
        return ok(productspage.render());
    }

    public Result checkout(){
        return ok(checkout.render());
    }

    public Result registerPage(){
        return ok(registerpage.render());
    }

}
