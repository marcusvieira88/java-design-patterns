package tech.marcusvieira.creational.abstractfactory.international;

import tech.marcusvieira.creational.abstractfactory.AbstractFactory;
import tech.marcusvieira.creational.abstractfactory.Account;

public class InternationalAccountFactory implements AbstractFactory {

    @Override
    public Account create(String type) {
        Account account = null;
        switch (type){
            case "BRAZIL" -> account = new BrazilAccount();
            case "US" -> account = new USAccount();
        }
        return account;
    }
}
