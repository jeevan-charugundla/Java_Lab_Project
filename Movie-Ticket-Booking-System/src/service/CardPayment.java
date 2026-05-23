package service;

/**
 * Handles Credit/Debit card transactions.
 * Demonstrates Inheritance (Implementing an Interface) and Polymorphism.
 */
public class CardPayment implements Payment {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Connecting to Card Gateway...");
        System.out.println("Processing Credit/Debit Card Payment of Rs." + amount + "...");
        // Mocking successful payment
        return true;
    }
}
