package places;


import critters.*;
import org.springframework.beans.factory.annotation.Autowired;

public class StarFleetShip {
    private Human kirk;
    private Human geordi;
    private Klingon worf;
    private Vulcan spock;

    public Human getKirk() {
        return kirk;
    }

    public void roleCall() {
        kirk.speak();
        geordi.speak();
        worf.speak();
        spock.speak();
    }

    public void destroy() {
        System.out.println("ship destroy()!");
    }

    @Autowired
    public void setKirk(Human kirk) {
        this.kirk = kirk;
    }

    public Human getGeordi() {
        return geordi;
    }

    @Autowired
    public void setGeordi(Human geordi) {
        this.geordi = geordi;
    }

    public Klingon getWorf() {
        return worf;
    }

    @Autowired
    public void setWorf(Klingon worf) {
        this.worf = worf;
    }

    public Vulcan getSpock() {
        return spock;
    }

    @Autowired
    public void setSpock(Vulcan spock) {
        this.spock = spock;
    }
}
