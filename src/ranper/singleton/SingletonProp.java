package ranper.singleton;

public class SingletonProp {

    private static SingletonProp singleton;
    private String value;

    private SingletonProp(String value) {
        this.value = value;
    }

    public static SingletonProp getInstace(String value) {
        if(singleton == null) {
            singleton = new SingletonProp(value);
        }
        return singleton;
    }

    public String getValue(){
        return value;
    }
}
