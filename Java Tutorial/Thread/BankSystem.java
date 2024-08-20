class BankAccount {
    private int balance = 1000; // Initial balance

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");
            try {
                Thread.sleep(100); // Simulate time taken to process withdrawal
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount);
        } else {
            System.out.println("Not enough balance for " + Thread.currentThread().getName() + " to withdraw " + amount);
        }
        System.out.println("Remaining balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private int amount;

    public WithdrawThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        // Create multiple threads trying to withdraw money
        WithdrawThread t1 = new WithdrawThread(account, 700);
        WithdrawThread t2 = new WithdrawThread(account, 500);
        WithdrawThread t3 = new WithdrawThread(account, 300);

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
