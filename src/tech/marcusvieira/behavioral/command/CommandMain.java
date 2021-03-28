package tech.marcusvieira.behavioral.command;


public class CommandMain {

    public static void main(String[] args) {

        Account account = new Account("Marcus", 0);

        BankProcessor processor = new BankProcessor();

        processor.executeOperation(new DepositOperation(account,300));
        processor.executeOperation(new WithdrawOperation(account,150));
        processor.executeOperation(new DepositOperation(account,400));

        System.out.println("Account holder="+account.getAccountHolder() +" balance="+account.getBalance());
    }
}
