package tech.marcusvieira.behavioral.command;

public class Account {

    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance+=amount;
        System.out.println("deposit="+balance);
    }
    public void withdraw(double amount) {
        balance-=amount;
        System.out.println("withdraw="+balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

