package static_variable_constant_and_method;

/**
 *
 * @author tabriji
 */
public class Circle {

    private int radius;
    private double pi = 3.1416;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", pi=" + pi + '}';
    }

}
