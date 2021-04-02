package tech.marcusvieira.creational.abstractfactory;

import tech.marcusvieira.creational.abstractfactory.international.InternationalAccountFactory;
import tech.marcusvieira.creational.abstractfactory.national.NationalAccountFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String type) {
        AbstractFactory factory = null;
        switch (type){
            case "NATIONAL" -> factory = new NationalAccountFactory();
            case "INTERNATIONAL" -> factory = new InternationalAccountFactory();
        }
        return factory;
    }
}
