package service;

/**
 * Interface representing a generic payment method.
 * Demonstrates Abstraction and Interface usage.
 */
public interface Payment {
    /**
     * Processes the payment for the given amount.
     * @param amount The amount to be paid.
     * @return true if successful, false otherwise.
     */
    boolean processPayment(double amount);
}
