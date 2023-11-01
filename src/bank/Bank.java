package bank;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    /**
     * {@code Constructor}
     * <p>
     * It initializes the customers array to hold 10 customers and the numberOfCustomers variable to 0.
     * </p>
     */
    public Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    /**
     * @param f First Name
     * @param l Last Name
     * */
    public void addCustomer(String f, String l) {
        int i = numberOfCustomers++;
        customers[i] = new Customer(f, l);
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int customer_index) {
        return customers[customer_index];
    }
}
