package demo;

import demo.places.Clinic;
import demo.places.House;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "demo")
public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Driver.class);

        Clinic aaronsVetClinic = context.getBean(Clinic.class);

        House kylesHouse = context.getBean(House.class);

        context.close();
    }
}



