package places;

import critters.Cat;
import org.springframework.beans.factory.annotation.Autowired;

public class House {
    private Cat houseCat1;
    private Cat houseCat2;
    private Cat houseCat3;

    @Autowired
    public void setHouseCat1(Cat aCat) {
        this.houseCat1 = aCat;
    }

    @Autowired
    public void setHouseCat2(Cat aCat) {
        this.houseCat2 = aCat;
    }

    @Autowired
    public void setHouseCat3(Cat aCat) {
        this.houseCat3 = aCat;
    }

    public Cat getHouseCat1() {
        return houseCat1;
    }

    public Cat getHouseCat2() {
        return houseCat2;
    }

    public Cat getHouseCat3() {
        return houseCat3;
    }
}
