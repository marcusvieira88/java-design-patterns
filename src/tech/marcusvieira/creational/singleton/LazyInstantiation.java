package tech.marcusvieira.creational.singleton;

public class LazyInstantiation {

    private static LazyInstantiation instance;

    private LazyInstantiation(){}

    public static LazyInstantiation getInstance(){
        if(instance==null){
            instance = new LazyInstantiation();
        }
        return instance;
    }
}
