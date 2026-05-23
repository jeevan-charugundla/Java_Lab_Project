# Movie Ticket Booking System

A simple Java console-based application designed to demonstrate the core concepts of Object-Oriented Programming (OOP). This project is beginner-friendly and perfect for a college lab submission or mini-project.

## Features
- **User Setup:** Records customer name and address dynamically.
- **Dynamic Catalog:** Displays available movies and different show timings.
- **Automated Calculations:** Automatically calculates the total cost based on the number of tickets and the selected movie's price.
- **Payment Gateway Simulation:** Allows users to choose between simulated UPI or Card payments.
- **Confirmation Receipt:** Prints a clean summary receipt after a successful transaction.

## Technologies and Concepts Used
- **Language:** Java (JDK 8+)
- **Environment:** Compatible with any standard terminal or IDE (IntelliJ IDEA, Eclipse, VS Code).
- **Core OOP Concepts Implemented:**
  - **Classes and Objects:** For entities like `Customer`, `Movie`, `Booking`.
  - **Encapsulation:** Making attributes `private` and exposing them through `getters`.
  - **Inheritance & Interfaces:** The `Payment` interface is implemented by `UpiPayment` and `CardPayment`.
  - **Polymorphism:** Method overriding inside payment implementations.
  - **Exception Handling:** `try-catch-finally` blocks and `InputMismatchException` handling in the main runner.
  - **Design Patterns:** Usage of a simple **Factory Pattern** (`PaymentFactory.java`) to instantiate payment types.

## Project Structure
```text
Movie-Ticket-Booking-System/
 ├── src/
 │    ├── main/
 │    │    └── Main.java             (Entry point)
 │    ├── model/
 │    │    ├── Customer.java         (User entity)
 │    │    ├── Movie.java            (Movie data structure)
 │    │    └── Booking.java          (Transaction details & receipt)
 │    └── service/
 │         ├── Payment.java          (Payment interface)
 │         ├── UpiPayment.java       (Concrete UPI)
 │         ├── CardPayment.java      (Concrete Card)
 │         └── PaymentFactory.java   (Payment generator)
 └── README.md
```

## How to Run
1. Ensure you have the Java Development Kit (JDK) installed on your system.
2. Clone this repository or download the source code zip.
3. Open your terminal or preferred IDE.
4. Navigate to the root directory `src/`.
5. Compile the program: `javac main/Main.java`
6. Run the program: `java main.Main`

## Sample Output
```text
==============================================
       MOVIE TICKET BOOKING SYSTEM            
==============================================
Enter your Name: John Doe
Enter your Address: 123 Main St

--- Available Movies ---
1. Inception - Rs.250.0
2. The Dark Knight - Rs.300.0
3. Interstellar - Rs.280.0

Select a Movie (1-3): 1

--- Show Timings for Inception ---
1. 10:00 AM
2. 01:30 PM
3. 06:00 PM

Select Timing (1-3): 2

Enter number of tickets: 3

Total Amount to Pay: Rs.750.0
1. UPI
2. Credit/Debit Card
Select Payment Method (1-2): 1
Initiating UPI Interface...
Processing UPI Payment of Rs.750.0...

==============================================
             BOOKING CONFIRMATION             
==============================================
  Customer Name  : John Doe
  Movie          : Inception
  Show Time      : 01:30 PM
  Tickets Booked : 3
  Total Amount   : Rs.750.0
  Payment Status : SUCCESS
==============================================
       Enjoy the movie! Have a great day!     
==============================================
```

## Author Details
- **Created by:** You (College Student)
- **Submission for:** Object-Oriented Programming (OOP) Lab / Mini Project
