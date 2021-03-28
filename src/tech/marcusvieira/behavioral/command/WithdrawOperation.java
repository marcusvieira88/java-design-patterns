package tech.marcusvieira.behavioral.command;

public class WithdrawOperation implements Operation {

    private Account account;
    private double amount;

    public WithdrawOperation(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void execute() {
        account.withdraw(amount);
        // .... maybe send a message to the account holder
    }
}
