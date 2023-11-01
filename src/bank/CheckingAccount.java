package bank;

public class CheckingAccount extends Account{
    private double overdraftLimit;

    /**
     * {@code Constructor}
     * @param balance
     * @param overdraftLimit
     */
    public CheckingAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    /**
      * {@code Constructor}
     * @param balance
      */
    public CheckingAccount(double balance) {
        this(balance, 0);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "Checking Account";
    }
}
