package bankacounts.Account;

public class AccountStatus1 {

    private int accNO;
    private double blance;
    private int deposit;
    private double withdraw;

    public int getAccNO() {
        return accNO;
    }

    public void setAccNO(int accNO) {
        this.accNO = accNO;
    }

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double deposit() {
        blance += deposit;
        return blance;
    }

    public double withdraw() {
        if (blance >= withdraw) {
            blance -= withdraw;

        } else {
            System.out.println("insufficinent Amount");
        }
        return blance;
    }
}