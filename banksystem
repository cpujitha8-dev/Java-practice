class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    // synchronized method (important for multithreading)
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + 
            " deposited " + amount + " | Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + 
                " withdrew " + amount + " | Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + 
                " insufficient balance!");
        }
    }
}

// Thread class
class UserThread extends Thread {
    BankAccount acc;

    public UserThread(BankAccount acc, String name) {
        super(name);
        this.acc = acc;
    }

    public void run() {
        acc.deposit(1000);
        acc.withdraw(500);
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        UserThread t1 = new UserThread(account, "User-1");
        UserThread t2 = new UserThread(account, "User-2");

        t1.start();
        t2.start();
    }
}
