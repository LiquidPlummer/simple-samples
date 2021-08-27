package critters;

import org.springframework.context.Lifecycle;

public class Cat{
    public Cat() {
        System.out.println("Meow - " + this.toString());
    }

    public void init() {
        System.out.println("Cat init()!");
    }

    //Why is this never called? - Because cat is a prototype!
    public void destroy() {
        System.out.println("cat destroy()!");
    }
}
