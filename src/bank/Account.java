package bank;

public abstract class Account {
    protected double balance;

    /**
     *  {@code Constructor}
     *  @param balance
     */
    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract boolean withdraw(double amount);

    public abstract String getDescription();

    @Override
    public String toString() {
        return getDescription() + ": current balance is " + balance;
    }
}
