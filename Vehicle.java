/**
 * The VehicleOne program implements an application that
 * gets input from the user, stores it in an object,
 * then uses a separate class to properly print it.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-5-16
 */
 
public class VehicleOne {
    private String _plateNum;
    private String _colour;
    private int _doorNum;
    private int _speed;
    private int _maxSpeed;
    
    /**
     * Default constructor for the class.
     */
    public VehicleOne (String plateNum, String colour,
        int doorNum, int speed, int maxSpeed) {
        this._plateNum = plateNum;
        this._colour = colour;
        this._doorNum = doorNum;
        this._speed = speed;
        this._maxSpeed = maxSpeed;
    }

    protected accelerate (int accelNum) {
        int newSpeed = speed + accelNum;

    }

    protected brake (int brakeNum) {

    }

    protected getSpeed () {

    }

    protected getMaxSpeed () {

    }

    protected getInfo () {

    }
}
