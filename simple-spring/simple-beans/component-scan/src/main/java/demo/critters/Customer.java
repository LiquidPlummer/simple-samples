package demo.critters;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Customer {
    public Customer() {
        System.out.println("I'm a customer! - " + this.toString());
    }
}
