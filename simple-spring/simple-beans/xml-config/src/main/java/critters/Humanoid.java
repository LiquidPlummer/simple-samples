package critters;

public class Humanoid {
    private String message;

    public Humanoid() {
        this.message = "I'm a humanoid!";
    }

    public Humanoid(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("Humanoid init()!");
    }

    public void destroy() {
        System.out.println("Humanoid destroy()");
    }

    public void speak() {
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
