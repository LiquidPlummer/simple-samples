package places;

import critters.Dog;
import critters.Pig;
import org.springframework.beans.factory.annotation.Autowired;

public class Farm {

    private Dog farmDog;
    private Pig farmPig;

    @Autowired
    public Farm(Dog aDog, Pig aPig) {
        this.farmDog = aDog;
        this.farmPig = aPig;
    }
}
