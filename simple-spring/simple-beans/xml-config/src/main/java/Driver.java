import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import places.StarFleetAcademy;
import places.StarFleetShip;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");

        StarFleetShip enterprise = context.getBean(StarFleetShip.class);
        enterprise.roleCall();

        StarFleetAcademy academy = context.getBean(StarFleetAcademy.class);
        academy.roleCall();

        context.close();
    }
}
