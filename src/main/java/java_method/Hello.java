/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_method;

/**
 *
 * @author tabriji
 */
public class Hello {

    public static void sayHello(String greeting) { //With the methods declared as static, you can directly call sayHello from the main method without the need to create an instance of the Hello class.

        System.out.println(greeting);
    }

    public static void main(String[] args) {
        String greeting = "Hello";
        sayHello(greeting);
    }
}
