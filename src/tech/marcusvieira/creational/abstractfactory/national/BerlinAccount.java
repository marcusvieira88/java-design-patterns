package tech.marcusvieira.creational.abstractfactory.national;

import tech.marcusvieira.creational.abstractfactory.Account;

public class BerlinAccount implements Account {

    @Override
    public void handle() {
        System.out.println("Berlin account handled");
    }
}
