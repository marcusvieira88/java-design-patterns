package tech.marcusvieira.creational.abstractfactory.international;

import tech.marcusvieira.creational.abstractfactory.Account;

public class USAccount implements Account {
    
    @Override
    public void handle() {
        System.out.println("US account handled");
    }
}
