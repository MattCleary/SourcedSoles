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


    public Result index() {
        return ok(index.render());
    }

    public Result products(){

        List<Product> productsList = Product.findAll();
        return ok(products.render(productsList));
    }

}
