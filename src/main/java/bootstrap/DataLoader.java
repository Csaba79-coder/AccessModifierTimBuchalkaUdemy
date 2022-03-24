package bootstrap;

import model.Account;

public class DataLoader {

    Account timAccount = new Account("Tim");

    public void load() {

        timAccount.deposit(1000);
        timAccount.withdraw(500);
        timAccount.withdraw(-200);
        timAccount.deposit(-20);
        timAccount.calculateBalance();
        // timAccount.balance = 5000; <- if it is private cannot reach!

        System.out.println("Balance on account is " + timAccount.getBalance());
        // timAccount.transactions.add(4500); <- if it is private cannot reach!
        timAccount.calculateBalance();
    }
}
