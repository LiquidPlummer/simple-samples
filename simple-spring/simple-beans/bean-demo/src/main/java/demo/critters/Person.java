package demo.critters;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person implements InitializingBean, DisposableBean {
    public Person() {
        System.out.println("I'm a person!   " + this.toString());
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("person destroyed! :(");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Person initialized!");
    }
}
