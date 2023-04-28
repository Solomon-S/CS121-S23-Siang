import java.util.ArrayList;

public class CustomerRecord {
    private ArrayList<Customer> customers;

    public CustomerRecord() {
        customers = new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public String getAllCustomers() {
        StringBuilder sb = new StringBuilder();
        for (Customer customer : customers) {
            sb.append(customer.getCustomerInfo());
        }
        return sb.toString();
    }
}
