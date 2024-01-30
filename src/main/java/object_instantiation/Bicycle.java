package object_instantiation;

/**
 *
 * @author tabriji
 */
public class Bicycle {

    private int pedalingRate = 0;
    private int speed = 0;
    private int gear = 1;

    public Bicycle() { //default constructor
    }

    public void changepedalingRate(int newValue) {
        pedalingRate = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void increaseSpeed(int increment) {
        speed += increment; // speed = speed + increment
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public String toString() {
        return "Pedaling Rate = " + pedalingRate + " per minute, Speed = " + speed + " km/h, Gear = " + gear;
    }

}
