import org.springframework.context.ConfigurableApplicationContext;
import places.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Farm myFarm = context.getBean(Farm.class);

        House myHouse = new House();

        context.close();

    }
}
