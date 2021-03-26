package co.edu.escuelaing.web;

import static spark.Spark.port;
import static spark.Spark.get;

import co.edu.escuelaing.math.MathService;
public class MathSparkWebService {


    public static void main(String... args){
        port(getPort());
        get("cos", (req,res) -> {
            res.type ("application/json");
            String dato = req.queryParams ("value");
            String respuesta = "{\"operation\": \"cos\",\"input\":" + dato+ ",\"output\":"+ MathService.cos(Double.parseDouble (dato))+"}";
            return respuesta;
        });
        get("asin", (req,res) -> {
            res.type ("application/json");
            String dato = req.queryParams ("value");
            String respuesta = "{\"operation\": \"asin\",\"input\":" + dato+ ",\"output\":"+ MathService.asin (Double.parseDouble (dato))+"}";
            return respuesta;
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}