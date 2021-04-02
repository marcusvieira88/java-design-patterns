package tech.marcusvieira.creational.abstractfactory.international;

import tech.marcusvieira.creational.abstractfactory.Account;

public class BrazilAccount implements Account {
    
    @Override
    public void handle() {
        System.out.println("Brazil account handled");
    }
}
