import java.util.ArrayList;
import java.util.List;

/**
 * The VehicleInventory program implements an application
 * that gets input from the user, stores it in an object,
 * then uses a separate class to properly print it.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-5-16
 */

public class VehicleInventory {

    /**
     * Default constructor for the class.
     */
    public VehicleInventory () {

    }

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

        // performs commands for each vehicle
        listOfVehicles.get(1).accelerate(30);
        listOfVehicles.get(2).accelerate(65);
        listOfVehicles.get(1).brake(26);
        listOfVehicles.get(2).brake(26);
        listOfVehicles.get(1).getSpeed();
        listOfVehicles.get(2).getSpeed();
        listOfVehicles.get(1).getMaxSpeed();
        listOfVehicles.get(2).getMaxSpeed();
        listOfVehicles.get(1).getInfo();
        listOfVehicles.get(2).getInfo();
    }
}


    //     // declaring variables
    //     String userOption1String = "";
    //     String userOption1Int = 0;
    //     String userOption2Low = "";
    //     String userOption2Up = "";

    //     while (userOption1Int == 0) { 
    //         // ask user what they would like to do
    //         System.out.print("Which vehicle would you like to use (1 or 2)?: ");
    //         userOption1String = sc.nextLine();

    //         if (userOption1String != "1" || userOption1String != "2") {
    //             // enter code for error message
    //             continue;
    //         }  else {
    //             userOption1Int = Integer.parseInt(userOption1String);
    //             break;
    //         }
    //     }
        
    //     // ask user what command they would like to perform
    //     System.out.print("Which command would you like to perform (A: Accelerate, B: Brake, )?: ");
    //     userOption2Low = sc.nextLine();
        
    //     userOption2Up = userOption2Low.toUpperCase();
        
    //     if 
    // }

    // for (int counter = 0; counter < listOfVehicles.size(); counter++) {
    //     listOfVehicles.get(counter).print();
    //     listofSubjectHistory.get(counter).print();
    // }
