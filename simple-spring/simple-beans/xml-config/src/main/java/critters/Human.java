package critters;

public class Human {
    private String name;

    public Human(String name) {
        setName(name);
    }

    public void speak() {
        System.out.println("I'm " + name + "!");
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
