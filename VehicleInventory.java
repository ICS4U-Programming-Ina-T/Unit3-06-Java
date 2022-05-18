import java.util.ArrayList;
import java.util.List;

/**
 * The VehicleInventory program implements an application
 * that creates two vehicles and calls separate classes
 * properly print information and alter the speed.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-5-16
 */

public class VehicleInventory {
    /**
     * Default constructor for the class.
     */
    public VehicleInventory() { }

    /**
     * Main entry into the program.
     *
     * @param args nothing passed in
     */
    public static void main(String[] args) {
        // create a vehicle
        Vehicle vehicleOne = new Vehicle("IJT 058", "White", 4, 0, 120);
        Vehicle vehicleTwo = new Vehicle("BBV 4389", "Navy Blue", 2, 0, 260);

        // declaring variables
        List<Vehicle> listOfVehicles = new ArrayList<Vehicle>();

        // adds vehicle to list
        listOfVehicles.add(vehicleOne);
        listOfVehicles.add(vehicleTwo);

        System.out.println("Adjustments for Vehicle One:");

        // calls appropriate methods for first vehicle
        listOfVehicles.get(0).getMaxSpeed();
        listOfVehicles.get(0).accelerate(30);
        listOfVehicles.get(0).accelerate(65);
        listOfVehicles.get(0).getSpeed();
        listOfVehicles.get(0).brake(25);
        listOfVehicles.get(0).accelerate(15);
        listOfVehicles.get(0).brake(1);
        listOfVehicles.get(0).getSpeed();

        System.out.println();
        System.out.println("Vehicle #1 Information:");

        // calls method in vehicle class to print info
        listOfVehicles.get(0).getInfo();

        System.out.println();
        System.out.println("Adjustments for Vehicle Two:");

        // calls appropriate methods for second vehicle
        listOfVehicles.get(1).getMaxSpeed();
        listOfVehicles.get(1).brake(13);
        listOfVehicles.get(1).accelerate(45);
        listOfVehicles.get(1).brake(26);
        listOfVehicles.get(1).getSpeed();
        listOfVehicles.get(1).accelerate(22);
        listOfVehicles.get(1).brake(4);
        listOfVehicles.get(1).getSpeed();
        listOfVehicles.get(1).accelerate(223);

        System.out.println();
        System.out.println("Vehicle #2:");

        // calls method in vehicle class to print info
        listOfVehicles.get(1).getInfo();
    }
}
