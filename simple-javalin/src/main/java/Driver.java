import io.javalin.Javalin;

import java.io.FileNotFoundException;


public class Driver {
    public static void main(String[] args) {

        /*
        1. match and invoke before-handlers
        2. match and invoke endpoint-handler
        3. match and invoke after-handlers
         */


        Javalin app = Javalin.create().start();
        app.get("/hello", ctx -> ctx.html("Hello, Javalin!"));
        app.post("/send-data", ctx -> {
            System.out.println(ctx.body());
        });

        app.get("/exception", ctx -> {
            throw new Exception("test");
        });

        app.exception(Exception.class, (e, ctx) -> {
            System.out.println("exception!!!!!!!!: " + e + " - " + ctx);
            ctx.status(500);
        });





        app.error(500, ctx -> {
            System.out.println("This is the error handler...");
            ctx.html("HEY KYLE!!! - 500 Internal Server Error!!!");
        });

    }
}
