package tech.marcusvieira.creational.singleton;

public class EagerInstantiation {

    private static EagerInstantiation instance = new EagerInstantiation();

    private EagerInstantiation(){}

    public static EagerInstantiation getInstance() {
        return instance;
    }
}
