package method_overloading;

public class Calculator {

    int performAddition(int a, int b) { // by using this method, we are limited to only adding two integers! which is not very practical
        int result = a + b;
        return result;
    }

    int performAddition(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public float performAddition(float a, float b) {
        float result = a + b;
        return result;
    }

    public double performAddition(double a, double b) {
        double result = a + b;
        return result;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sumTwo = calc.performAddition(5, 4);
        int sumThree = calc.performAddition(5, 4, 9);

        System.out.println(sumTwo);
        System.out.println(sumThree);
    }

    /* Method overloading can be achieved in three different ways:
        1. Difference in method parameter number
        2. Difference in parameter data type
        3. Same number of parameters and same data type, but different sequence
     */
}
