import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
  staticFileLocation("/public");
  String layout = "templates/layout.vtl";

  get("/", (request, response) -> {
  HashMap<String, Object> model = new HashMap<String, Object>();

  model.put("username", request.session().attribute("username"));
  model.put("template", "templates/home.vtl");

  return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());

  post("/home", (request, response) -> {
  HashMap<String, Object> model = new HashMap<String, Object>();

  String inputtedUsername = request.queryParams("username");
  request.session().attribute("username", inputtedUsername);
  System.out.println(inputtedUsername);
  model.put("username", inputtedUsername);

  model.put("template", "templates/home.vtl");
  return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());

  get("/triangles", (request, response) -> {
    HashMap<String, Object> model = new HashMap<String, Object>();
    model.put("template", "templates/triangles.vtl");

    int sideA = Integer.parseInt(request.queryParams("sideA"));
    int sideB = Integer.parseInt(request.queryParams("sideB"));
    int sideC = Integer.parseInt(request.queryParams("sideC"));

    Triangles myTriangle = new Triangles(sideA, sideB, sideC);
    model.put("myTriangle", myTriangle);

    return new ModelAndView(model, layout);
  },  new VelocityTemplateEngine());

  }
}
