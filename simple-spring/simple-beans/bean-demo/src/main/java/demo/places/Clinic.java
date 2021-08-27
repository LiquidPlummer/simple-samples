package demo.places;

import demo.critters.Cat;
import demo.critters.Dog;
import demo.critters.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Clinic {
    private Person vet;
    private Cat patient1;
    private Dog patient2;

    @Autowired
    public Clinic(Person vet, Cat patient1, Dog patient2) {
        this.vet = vet;
        this.patient1 = patient1;
        this.patient2 = patient2;
    }

    public Person getVet() {
        return vet;
    }

    public Cat getPatient1() {
        return patient1;
    }

    public Dog getPatient2() {
        return patient2;
    }
}
