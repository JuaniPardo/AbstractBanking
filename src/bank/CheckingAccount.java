package bank;

public class CheckingAccount extends Account{
    private final double OVERDRAFT_LIMIT;

    /**
     * {@code Constructor}
     * @param balance
     * @param OVERDRAFT_LIMIT
     */
    public CheckingAccount(double balance, double OVERDRAFT_LIMIT) {
        super(balance);
        this.OVERDRAFT_LIMIT = OVERDRAFT_LIMIT;
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
        if (amount <= balance + OVERDRAFT_LIMIT) {
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
