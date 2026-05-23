package main;

import model.Booking;
import model.Customer;
import model.Movie;
import service.Payment;
import service.PaymentFactory;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Main execution class for the Movie Ticket Booking System.
 * Handles the console UI, inputs, and orchestrates the application flow.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("==============================================");
            System.out.println("       MOVIE TICKET BOOKING SYSTEM            ");
            System.out.println("==============================================");

            // 1. Gather Customer details
            System.out.print("Enter your Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter your Address: ");
            String address = scanner.nextLine();
            
            Customer customer = new Customer(name, address);

            // 2. Setup mock database of movies
            List<Movie> availableMovies = Arrays.asList(
                    new Movie("Inception", 250.0, Arrays.asList("10:00 AM", "01:30 PM", "06:00 PM")),
                    new Movie("The Dark Knight", 300.0, Arrays.asList("11:00 AM", "04:00 PM", "08:30 PM")),
                    new Movie("Interstellar", 280.0, Arrays.asList("09:30 AM", "02:15 PM", "07:45 PM"))
            );

            // 3. Display available movies
            System.out.println("\n--- Available Movies ---");
            for (int i = 0; i < availableMovies.size(); i++) {
                System.out.println((i + 1) + ". " + availableMovies.get(i).getTitle() + " - Rs." + availableMovies.get(i).getPrice());
            }

            // 4. Movie Selection logic
            System.out.print("\nSelect a Movie (1-" + availableMovies.size() + "): ");
            int movieChoice = scanner.nextInt();
            
            if (movieChoice < 1 || movieChoice > availableMovies.size()) {
                System.out.println("Invalid movie selection! Terminating...");
                return;
            }
            Movie selectedMovie = availableMovies.get(movieChoice - 1);

            // 5. Showtime selection logic
            System.out.println("\n--- Show Timings for " + selectedMovie.getTitle() + " ---");
            selectedMovie.displayTimings();
            
            System.out.print("\nSelect Timing (1-" + selectedMovie.getTimings().size() + "): ");
            int timeChoice = scanner.nextInt();
            
            if (timeChoice < 1 || timeChoice > selectedMovie.getTimings().size()) {
                System.out.println("Invalid time selection! Terminating...");
                return;
            }
            String selectedTime = selectedMovie.getTimings().get(timeChoice - 1);

            // 6. Tickets logic
            System.out.print("\nEnter number of tickets: ");
            int tickets = scanner.nextInt();
            
            if (tickets <= 0) {
                System.out.println("You must book at least 1 ticket! Terminating...");
                return;
            }

            // 7. Initialize booking object (It will automatically calculate the total price)
            Booking booking = new Booking(customer, selectedMovie, selectedTime, tickets);

            // 8. Payment logic
            System.out.println("\nTotal Amount to Pay: Rs." + booking.getTotalAmount());
            System.out.println("1. UPI");
            System.out.println("2. Credit/Debit Card");
            System.out.print("Select Payment Method (1-2): ");
            int payChoice = scanner.nextInt();

            // Factory creates specific payment object based on the user's choice
            Payment payment = PaymentFactory.getPaymentMethod(payChoice);
            
            // 9. Process payment and display receipt
            booking.printSummary(payment);

        } catch (InputMismatchException e) {
            // Raised when the user inputs a String when a Number is expected
            System.out.println("\nError: Invalid input format. Please enter numerical values where expected.");
        } catch (IllegalArgumentException e) {
            // Raised when the user enters an invalid payment ID causing Factory pattern to crash
            System.out.println("\nError: " + e.getMessage());
        } catch (Exception e) {
            // Fallback for any other unexpected exception
            System.out.println("\nAn unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Thank you for using the Movie Ticket Booking System!");
        }
    }
}
