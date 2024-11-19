package entities;

public class BankAccount {
    private final int accountNumber;
    private String holder;
    private double balance;

    public BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.depositAmount(balance);
    }

    public BankAccount(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void depositAmount(double amount) {
        this.balance += amount;
    }

    public void withdrawAmount(double amount) {
        this.balance = this.balance - amount - 5.00;
    }

    @Override
    public String toString() {
        return "Account " + accountNumber + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }
}
