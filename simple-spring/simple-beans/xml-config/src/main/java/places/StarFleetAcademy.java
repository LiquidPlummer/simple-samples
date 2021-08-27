package places;

import critters.Humanoid;
import org.springframework.beans.factory.annotation.Autowired;

public class StarFleetAcademy {
    private Humanoid cadet1;
    private Humanoid cadet2;
    private Humanoid cadet3;

    public void roleCall() {
        cadet1.speak();
        cadet2.speak();
        cadet3.speak();
    }

    public Humanoid getCadet1() {
        return cadet1;
    }

    @Autowired
    public void setCadet1(Humanoid cadet1) {
        this.cadet1 = cadet1;
    }

    public Humanoid getCadet2() {
        return cadet2;
    }

    @Autowired
    public void setCadet2(Humanoid cadet2) {
        this.cadet2 = cadet2;
    }

    public Humanoid getCadet3() {
        return cadet3;
    }

    @Autowired
    public void setCadet3(Humanoid cadet3) {
        this.cadet3 = cadet3;
    }
}
