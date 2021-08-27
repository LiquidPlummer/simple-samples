import critters.Cat;
import critters.Dog;
import critters.Pig;
import places.Farm;
import places.House;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    /*

     */

    @Bean
    @Lazy //Try taking this annotation out, why does the pig constructor get called eagerly if pig is still lazy?
    public Farm farm() {
        return new Farm(dog(), pig());
    }

    @Bean
    public House house() {
        return new House();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Dog dog() {
        return new Dog();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")
    public Cat cat() {
        return new Cat();
    }

    @Bean
    @Lazy
    public Pig pig() {
        return new Pig();
    }
}
