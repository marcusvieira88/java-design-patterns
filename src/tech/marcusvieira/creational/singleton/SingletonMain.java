package tech.marcusvieira.creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        EagerInstantiation eagerInstance = EagerInstantiation.getInstance();
        System.out.println(eagerInstance.getClass());

        LazyInstantiation lazyInstance = LazyInstantiation.getInstance();
        System.out.println(lazyInstance.getClass());
    }
}
