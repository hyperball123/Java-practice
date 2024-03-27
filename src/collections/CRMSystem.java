package collections;

import java.util.ArrayList;

//Arraylist example
class Customer {
    private String name;
    private String email;
    private String phone;

    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
public class CRMSystem {
    private ArrayList<Customer> customers;

    public CRMSystem(){
// initializing the customers arraylist
        customers = new ArrayList<>();
    }

    // Add a new customer to the CRM system
    public void addCustomer(String name,String email,String phone) {
        customers.add(new Customer(name,email,phone));
    }

    // Search for a customer by email
    public Customer findCustomerByEmail(String email) {
        for(Customer customer : customers) {
            if(customer.getEmail().equals(email)){
                return customer;
            }
        }
        return null;
    }

    public void updateCustomer(String email, String newName, String newEmail) {
        Customer customerToUpdate = findCustomerByEmail(email);
        if (customerToUpdate != null) {
            customerToUpdate.setName(newName);
            customerToUpdate.setEmail(newEmail);
            System.out.println("Customer updated!");

        } else {
            System.out.println("Customer not found!");
        }
    }

    // Remove a customer from the CRM system by email
    public void removeCustomer(String email) {
        Customer customerToRemove = findCustomerByEmail(email);
        if (customerToRemove != null) {
            customers.remove(customerToRemove);
            System.out.println("Customer removed successfully.");
        } else {
            System.out.println("Customer not found!");
        }
    }

    // Display all customers in the CRM system
    public void displayAllCustomers() {
        System.out.println("Customers:");
        for (Customer customer : customers) {
            System.out.println("Name: " + customer.getName() + ", Email: " + customer.getEmail() + ", Phone: " + customer.getPhone());
        }
    }

    public static void main(String[] args) {
        CRMSystem crm = new CRMSystem();

        crm.addCustomer("Alice", "alice@example.com", "1234567890");
        crm.addCustomer("Bob", "bob@example.com", "9876543210");
        crm.addCustomer("Bob2", "bob2@example.com", "9882543210");

        crm.displayAllCustomers();

        // Update a customer's information
        crm.updateCustomer("bob@example.com", "Alice Smith", "alice.smith@example.com");

        crm.displayAllCustomers();

        crm.removeCustomer("bob2@example.com");

        crm.displayAllCustomers();
    }
}
