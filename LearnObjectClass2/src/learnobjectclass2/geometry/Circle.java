package learnobjectclass2.geometry;

public class Circle {

    public double radius;

    public double getArea() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }

    public double getperimetar() {
        double result = 2 * Math.PI * radius;
        return result;
    }
}
