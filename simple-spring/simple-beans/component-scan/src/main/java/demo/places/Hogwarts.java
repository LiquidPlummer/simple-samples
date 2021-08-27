package demo.places;

import demo.critters.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hogwarts {
    private Harry harry;
    private Ron ron;

    public Hogwarts(){
    }

    public Harry getHarry() {
        return harry;
    }

    @Autowired
    public void setHarry(Harry harry) {
        this.harry = harry;
    }

    public Ron getRon() {
        return ron;
    }

    @Autowired
    public void setRon(Ron ron) {
        this.ron = ron;
    }
}
