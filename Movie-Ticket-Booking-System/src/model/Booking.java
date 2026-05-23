package model;

import service.Payment;

/**
 * Connects the Customer, Movie, and Payment processes together.
 * Demonstrates object association.
 */
public class Booking {
    private Customer customer;
    private Movie movie;
    private String time;
    private int tickets;
    private double totalAmount;

    public Booking(Customer customer, Movie movie, String time, int tickets) {
        this.customer = customer;
        this.movie = movie;
        this.time = time;
        this.tickets = tickets;
        this.totalAmount = movie.getPrice() * tickets;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Displays a formatted receipt for the user.
     * @param paymentMethod The polymorphic payment object used to pay.
     */
    public void printSummary(Payment paymentMethod) {
        boolean isSuccess = paymentMethod.processPayment(this.totalAmount);
        
        System.out.println("\n==============================================");
        System.out.println("             BOOKING CONFIRMATION             ");
        System.out.println("==============================================");
        System.out.println("  Customer Name  : " + customer.getName());
        System.out.println("  Movie          : " + movie.getTitle());
        System.out.println("  Show Time      : " + time);
        System.out.println("  Tickets Booked : " + tickets);
        System.out.println("  Total Amount   : Rs." + totalAmount);
        System.out.println("  Payment Status : " + (isSuccess ? "SUCCESS" : "FAILED"));
        System.out.println("==============================================");
        System.out.println("       Enjoy the movie! Have a great day!     ");
        System.out.println("==============================================\n");
    }
}
