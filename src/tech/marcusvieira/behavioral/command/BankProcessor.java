package tech.marcusvieira.behavioral.command;


public class BankProcessor {

    public void executeOperation(Operation operation){
        operation.execute();
    }
}
