package tech.marcusvieira.creational.abstractfactory.national;

import tech.marcusvieira.creational.abstractfactory.Account;

public class DresdenAccount implements Account {
    
    @Override
    public void handle() {
        System.out.println("Dresden account handled");
    }
}
