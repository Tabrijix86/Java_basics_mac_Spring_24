/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_method;

/**
 *
 * @author tabriji
 */
public class Calculator {

    public int performAddition(int a, int b) {
        int result = a + b;

        return result;
    }

    public int performSubtraction(int a, int b) {
        int result = a - b;

        return result;
    }

    private void doSomething() { // Known as access modifier. Will dive deeper in future classes!
        System.out.println("Checking if method is inaccessible");
    }

    public static void main(String[] args) { //Remember, the main method serves as the entry point for the program's execution

        // Creating an instance of Calculator
        Calculator specialCalc = new Calculator();

        // Calling the doSomething() method
        specialCalc.doSomething();
        specialCalc.doSomethingMore();
    }
    
    // However, amongst the 6 elements only 3 are mandatory: return type, method name, method body
    void doSomethingMore() {
        //body
    }
}
