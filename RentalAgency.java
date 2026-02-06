import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Car> fleet = new ArrayList<>();
    private List<String> transactions = new ArrayList<>();

    public void addCar(Car car) {
        fleet.add(car);
    }

    public void displayAvailableCars() {
        System.out.println("\n--- Current Fleet ---");
        boolean anyAvailable = false;
        for (Car c : fleet) {
            System.out.println(c);
            if (c.isAvailable()) anyAvailable = true;
        }
        if (!anyAvailable) {
            System.out.println("No cars currently available.");
        }
    }

    public void processRental(String plateNumber) {
        for (Car c : fleet) {
            if (c.getPlateNumber().equalsIgnoreCase(plateNumber)) {
                if (c.isAvailable()) {
                    c.setAvailable(false);
                    String record = "Rented: " + c.getModel() + " [" + c.getPlateNumber() + "]";
                    transactions.add(record);
                    System.out.println("Success! " + record);
                } else {
                    System.out.println("This car is already rented.");
                }
                return;
            }
        }
        System.out.println("Car with plate " + plateNumber + " not found.");
    }

    public void displayTransactions() {
        System.out.println("\n--- Rental Transactions ---");
        if (transactions.isEmpty()) {
            System.out.println("No transactions recorded yet.");
        } else {
            for (String t : transactions) {
                System.out.println("- " + t);
            }
        }
    }
}