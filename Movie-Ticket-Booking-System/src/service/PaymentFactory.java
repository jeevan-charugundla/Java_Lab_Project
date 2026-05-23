package service;

/**
 * A simple factory class to generate Payment objects.
 * Demonstrates the Factory Design Pattern.
 */
public class PaymentFactory {
    
    /**
     * Returns a specific implementation of the Payment interface based on choice.
     * @param choice User's menu choice
     * @return Payment object
     * @throws IllegalArgumentException if choice is invalid
     */
    public static Payment getPaymentMethod(int choice) {
        if (choice == 1) {
            return new UpiPayment();
        } else if (choice == 2) {
            return new CardPayment();
        }
        throw new IllegalArgumentException("Invalid payment method selected.");
    }
}
