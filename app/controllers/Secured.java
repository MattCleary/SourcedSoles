package controllers;

import play.*;
import models.*;
import play.mvc.*;
import play.mvc.Http.*;


public class Secured extends Security.Authenticator{


    @Override
    public String getUserName(Context ctx){
        return ctx.session().get("email");
    }

    @Override
    public Result onUnauthorized(){
        return redirect(controllers.routes.LoginController.login());
    }

}
