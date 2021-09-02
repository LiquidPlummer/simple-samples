public class Factory {
    private static Factory factory;

    private Factory() {

    }

    public static Factory getFactory() {
        return new Factory();
    }
}
