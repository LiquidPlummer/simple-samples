package demo.places;

import demo.critters.Customer;
import demo.critters.Rosmerta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Hogsmeade {
    private Rosmerta rosemerta;
    private Customer customer1;
    private Customer customer2;

    @Autowired
    public Hogsmeade(Rosmerta rosemerta, Customer customer1, Customer customer2) {
        this.rosemerta = rosemerta;
        this.customer1 = customer1;
        this.customer2 = customer2;
    }
}
