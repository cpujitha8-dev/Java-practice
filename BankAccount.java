class BankAccount {
    private int balance;
    void withdraw(int amount) {
    if(amount > balance) {
        System.out.println("Insufficient balance");
    } else {
        balance = balance - amount;
        System.out.println("Withdraw successful");
    }
}

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
        
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        
        b1.deposit(1000);
       b1.withdraw(1200);   // more than balance
       b1.checkBalance();
    }
}
