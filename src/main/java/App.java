import Models.Hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public  static void main(String[] args){
        staticFileLocation("/public");
        /*Route route for our app- View renders what is displayed to our user*/
        get("/", (request, response) -> {
            Map<String,Object> model = new HashMap<String, Object>();
            return new ModelAndView(model,"first-view.hbs");
        }, new HandlebarsTemplateEngine());

        /*Route to retrieve content inputted by the user*/
        get("/squads/new",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "new-squad.hbs");
        }, new HandlebarsTemplateEngine());




    };
}