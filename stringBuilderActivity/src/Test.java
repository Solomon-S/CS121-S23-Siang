public class Test {
    public static void main(String[] args) {
        CustomerRecord record = new CustomerRecord();

        Customer customer1 = new Customer("Solomon", "Siang", "897-7654", "solo89@example.com", "ABC123", 19);
        Customer customer2 = new Customer("Bob", "Smith", "446-0865", "bob90@example.com", "DEF456", 40);

        record.addCustomer(customer1);
        record.addCustomer(customer2);

        String allCustomers = record.getAllCustomers();
        System.out.println(allCustomers);
    }
}
