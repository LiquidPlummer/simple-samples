package demo.critters;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    public Dog() {
        System.out.println("Woof!   " + this.toString());
    }
}
