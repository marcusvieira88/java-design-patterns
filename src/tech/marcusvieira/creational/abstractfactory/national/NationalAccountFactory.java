package tech.marcusvieira.creational.abstractfactory.national;

import tech.marcusvieira.creational.abstractfactory.AbstractFactory;
import tech.marcusvieira.creational.abstractfactory.Account;
import tech.marcusvieira.creational.abstractfactory.national.BerlinAccount;
import tech.marcusvieira.creational.abstractfactory.national.DresdenAccount;

public class NationalAccountFactory implements AbstractFactory {

    @Override
    public Account create(String type) {
        Account transaction = null;
        switch (type){
            case "BERLIN" -> transaction = new BerlinAccount();
            case "DRESDEN" -> transaction = new DresdenAccount();
        }
        return transaction;
    }
}
