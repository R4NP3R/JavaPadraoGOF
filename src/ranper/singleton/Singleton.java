package ranper.singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstace () {
        if(singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

}
