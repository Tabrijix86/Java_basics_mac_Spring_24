/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object_instantiation;

/**
 *
 * @author tabriji
 */
public class Bicycle_Demo {

    public static void main(String[] args) {

        // Creating two different bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Calling the methods on these objects
        bike1.changepedalingRate(50);
        bike1.increaseSpeed(10);
        bike1.changeGear(3);

        System.out.println("Bike 1: " + bike1.toString());

        bike2.changepedalingRate(80);
        bike2.increaseSpeed(15);
        bike2.changeGear(4);
        System.out.println("Bike 2: " + bike2.toString());

        bike2.changepedalingRate(40);
        bike2.changeGear(2);
        System.out.println("Bike 2: " + bike2.toString());

    }
}
