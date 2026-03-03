interface Bank {
    double getBalance();
}

class SavingsAccount implements Bank {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

   
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank account = new SavingsAccount(6000);
        System.out.println("Balance: " + account.getBalance());
    }
}
