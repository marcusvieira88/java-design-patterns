package tech.marcusvieira.behavioral.command;

public class DepositOperation implements Operation {

    private Account account;
    private double amount;

    public DepositOperation(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void execute() {
        account.deposit(amount);
        // .... maybe send a message to the account holder
    }
}
