package bank;

import java.util.Date;

public class TimeDepositAccount extends Account {

    private final Date maturityDate;

    /**
     * {@code Constructor}
     * @param balance
     * @param maturityDate
     */
    public TimeDepositAccount(double balance, Date maturityDate) {
        super(balance);
        this.maturityDate = maturityDate;
    }


    /**
     * The withdraw function will only allow the user to withdraw money from their account if it is after the maturity date.
     * @param amount Determine the amount of money to be withdrawn
     */
    @Override
    public boolean withdraw(double amount) {
        Date today = new Date();
        if (today.after(maturityDate)) {
            if (amount <= balance) {
                balance -= amount;
                return true;
            } else {
                // Amount to withdraw exceeds the balance plus the overdraft limit
                return false;
            }
        } else {
            // Today is before the maturity date
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "Time Deposit Account " + maturityDate;
    }

}