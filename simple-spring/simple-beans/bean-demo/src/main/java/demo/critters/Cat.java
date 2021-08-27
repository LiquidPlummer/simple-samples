package demo.critters;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Cat implements InitializingBean, DisposableBean {
    public Cat() {
        System.out.println("Meow!   " + this.toString());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Cat destroyed! :(");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat initialized! :)");
    }
}
