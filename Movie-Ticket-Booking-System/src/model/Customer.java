package model;

/**
 * Represents a customer in the booking system.
 * Demonstrates Encapsulation by restricting direct access to fields.
 */
public class Customer {
    private String name;
    private String address;

    // Constructor
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter methods for encapsulation
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
