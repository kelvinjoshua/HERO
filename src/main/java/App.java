import Models.Hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Models.Squad;
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

        post("/squads", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Squad> squads = request.session().attribute("squads");
            if(squads == null) {
                squads = new ArrayList<Squad>();
                request.session().attribute("squads", squads);
            }
            /*QueryParameters from the url*/
            String name = request.queryParams("name");
            int size = Integer.parseInt(request.queryParams("size"));
            String cause = request.queryParams("cause");
            /*Create a new Squad instance*/
            Squad newSquad = new Squad(name, size, cause);
            squads.add(newSquad);/*Add instance to the arraylist*/
            return new ModelAndView(model, "assert.hbs");
        }, new HandlebarsTemplateEngine());

        /*This route retrieves current instances (squads) present*/
        get("/squads", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Squad> squads = Squad.getSquads();
            model.put("squads", squads);
            return new ModelAndView(model, "squad.hbs");
        }, new HandlebarsTemplateEngine());


    };
}