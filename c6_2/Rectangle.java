package c6_2;

public class Rectangle implements GeometricObject{

    private double width;
    private double length;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return ( length + width ) * 2;
    }
}
