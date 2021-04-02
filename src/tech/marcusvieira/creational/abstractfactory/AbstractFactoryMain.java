package tech.marcusvieira.creational.abstractfactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        Account berlinAccount = FactoryProvider.getFactory("NATIONAL").create("BERLIN");
        berlinAccount.handle();

        Account dresdenAccount = FactoryProvider.getFactory("NATIONAL").create("DRESDEN");
        dresdenAccount.handle();

        Account brazilAccount = FactoryProvider.getFactory("INTERNATIONAL").create("BRAZIL");
        brazilAccount.handle();

        Account usAccount = FactoryProvider.getFactory("INTERNATIONAL").create("US");
        usAccount.handle();
    }
}
