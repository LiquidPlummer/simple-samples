package demo.places;

import demo.critters.Dog;
import demo.critters.Person;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class House implements DisposableBean {
    private Person husband;
    private Person wife;
    private Dog feiFei;

    public Person getHusband() {
        return husband;
    }

    @Autowired
    public void setHusband(Person husband) {
        this.husband = husband;
    }

    public Person getWife() {
        return wife;
    }

    @Autowired
    public void setWife(Person wife) {
        this.wife = wife;
    }

    public Dog getFeiFei() {
        return feiFei;
    }

    @Autowired
    public void setFeiFei(Dog feiFei) {
        this.feiFei = feiFei;
    }

    @Override
    public void destroy() throws Exception {
        husband.destroy();
        wife.destroy();
    }
}
