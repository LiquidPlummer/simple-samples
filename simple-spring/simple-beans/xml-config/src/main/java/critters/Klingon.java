package critters;

public class Klingon{
    private String name;

    public Klingon(String name) {
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
