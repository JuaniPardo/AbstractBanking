package bank;

public class CustomerReport {
    private Bank bank;

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    /**
     * The generateReport function prints a report of all the customers and their accounts.
     * It iterates through each customer in the bank, printing their name and then iterating
     * through each account for that customer, printing its balance.
     * @return Void
     */
    public void generateReport() {

        // Print report header
        System.out.println("\n\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        // For each customer...
        for (int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++) {
            Customer customer = bank.getCustomer(cust_idx);

            // Print the customer's name
            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());

            // For each account for this customer...
            for (int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++) {
                Account account = customer.getAccount(acct_idx);

                // Print the current balance of the account
                System.out.println("    " + account);
            }
        }
    }
}
