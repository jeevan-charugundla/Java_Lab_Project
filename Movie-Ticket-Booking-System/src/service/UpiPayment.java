package service;

/**
 * Handles UPI base transactions.
 * Demonstrates Inheritance (Implementing an Interface) and Polymorphism.
 */
public class UpiPayment implements Payment {
    
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Initiating UPI Interface...");
        System.out.println("Processing UPI Payment of Rs." + amount + "...");
        // Mocking successful payment
        return true;
    }
}
