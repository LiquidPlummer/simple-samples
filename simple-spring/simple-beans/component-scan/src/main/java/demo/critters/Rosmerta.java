package demo.critters;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Rosmerta {
    public Rosmerta() {
        System.out.println("I'm Rosemerta!");
    }
}
