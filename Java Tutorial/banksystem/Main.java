class Bank {
    int balance;
    String name;
    static String BankName = "JA-Bank";
    static int totalBalance = 0;

    Bank() {
    }

    Bank(int balance) {
        this("Default-Jayesh", balance);
    }

    Bank(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public synchronized void witdraw(int amount) {
        if (amount > balance) {
            System.out.println(Thread.currentThread().getName() + " Your balance of [" + balance
                    + "] is insufficient for this transaction.");
        } else {
            System.out.println("Please Wait " + Thread.currentThread().getName() + " Withdrawal underproccesing...");
            try {
                Thread.sleep(2000); // Concider The transaction are take 2 sec to perfome all opration are performed
                                    // like database change this type
            } catch (InterruptedException e) {
                System.out.println(e);
            } finally {
                // add database close and this type of opration
            }
            System.out.println("Transaction Complate...");
            balance -= amount;
            synchronized (Bank.class) {
                totalBalance(amount);
            }

            // totalBalance(amount); if static Synchronized block use
            System.out.println(Thread.currentThread().getName() + " Your Current balance is [" + balance + "]");
        }
    }

    // public synchronized static void totalBalance(int amount) {
    // try {
    // int total = totalBalance;
    // Thread.sleep(2000);
    // totalBalance = total + amount;
    // } catch (InterruptedException e) {
    // System.out.println(e);
    // }
    // System.out.println(totalBalance);
    // }
    public synchronized void totalBalance(int amount) {
        try {
            int total = totalBalance;
            Thread.sleep(2000);
            totalBalance = total + amount;
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(totalBalance);
    }

    public synchronized void diposite(int amount) {
        if (amount <= 0) {
            System.out.println("Please add correct amount...");
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            } finally {
                // add database close and this type of opration
            }
            balance += amount;
            System.out.println("Deposite are successfully done...");
            System.out.println(Thread.currentThread().getName() + " Your Current balance is [" + balance + "]");
        }
    }

    public synchronized void checkBalance() {
        System.out.println(Thread.currentThread().getName() + " Your Current balance is [" + balance + "]");
    }
}

class BankSystem extends Thread {
    Bank bank;

    BankSystem(Bank bank, String name) {
        this.bank = bank;
        this.setName(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Are Called");
        bank.witdraw(2000);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank(2000);
        Bank bank1 = new Bank(2000);
        Bank bank2 = new Bank(2000);
        Bank bank3 = new Bank(2000);
        BankSystem jayesh = new BankSystem(bank, "Jayesh");
        BankSystem manju = new BankSystem(bank1, "Manju");
        BankSystem rekha = new BankSystem(bank2, "Rekha");
        BankSystem bhikhu = new BankSystem(bank3, "Bhikhu");
        jayesh.start();
        manju.start();
        rekha.start();
        bhikhu.start();
        jayesh.join();
    }
}
