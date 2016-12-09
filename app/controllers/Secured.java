package controllers;

import play.*;
import models.*;
import play.mvc.*;
import play.mvc.Http.*;
import play.Logger;


public class Secured extends Security.Authenticator{

    public String getUsername(Context ctx){
        Logger.debug("id: " + ctx.session().get("email"));
        return ctx.session().get("email");
    }

    public Result onUnauthorized(Context ctx){
        Logger.debug("unauthorised: " + ctx.session().get("email"));
        return redirect(controllers.routes.LoginController.login());
    }

}
