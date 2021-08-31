import io.javalin.Javalin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        Javalin app = Javalin.create()
                .start(7000);
        app.get("/hello", ctx -> ctx.html("Hello, Javalin!"));

        app.get("/exception", ctx -> {
            throw new Exception("test");
        });

        app.exception(Exception.class, (e, ctx) -> {
            System.out.println("exception: " + e + " - " + ctx);
            ctx.status(500);
        });

        app.error(500, "html", ctx -> {
           ctx.result("500 Internal Server Error!!!");
        });
    }
}
