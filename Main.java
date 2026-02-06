import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the Car Rental System ===");
        
        // Step 1: Authenticate User (Part 2 of Assignment)
        if (loginSystem.authenticate()) {
            // Step 2: Initialize System (Part 1 of Assignment)
            RentalAgency agency = new RentalAgency();
            setupInitialFleet(agency);

            boolean running = true;
            while (running) {
                System.out.println("\n--- Dashboard ---");
                System.out.println("1. View Available Cars");
                System.out.println("2. Rent a Car");
                System.out.println("3. Exit");
                System.out.print("Select an option: ");
                
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        agency.displayAvailableCars();
                        break;
                    case "2":
                        System.out.print("Enter Plate Number to rent: ");
                        String plate = scanner.nextLine();
                        agency.processRental(plate);
                        break;
                    case "3":
                        running = false;
                        System.out.println("Exiting system. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } else {
            System.out.println("Access Denied: Too many failed attempts.");
        }
        scanner.close();
    }

    private static void setupInitialFleet(RentalAgency agency) {
        agency.addCar(new Car("ABC-123", "Toyota Camry"));
        agency.addCar(new Car("XYZ-789", "Honda Civic"));
        agency.addCar(new Car("LUX-007", "Tesla Model 3"));
    }
}