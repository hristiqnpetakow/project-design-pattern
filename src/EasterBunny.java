public class EasterBunny {
    private static EasterBunny instance;

    private EasterBunny() {

    }

    public static EasterBunny getInstance() {
        if(instance == null) {
            instance = new EasterBunny();
        }
        return instance;
    }

    public void connect(String coin) {
        System.out.println("Connecting with: " + coin);
    }
}
