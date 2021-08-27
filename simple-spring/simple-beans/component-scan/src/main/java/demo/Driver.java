package demo;

import demo.places.Hogwarts;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import demo.places.Hogsmeade;

@ComponentScan(basePackages = "demo")
public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Driver.class);

        Hogsmeade hogsmeade = context.getBean(Hogsmeade.class);

        Hogwarts hogwarts = context.getBean(Hogwarts.class);

        context.close();
    }
}
