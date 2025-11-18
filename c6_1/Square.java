package c6_1;

public class Square extends Rectangle{
    protected double side ;
    public Square () {

    }

    public Square (double side) {
        this.side = side;
    }

    public Square(String color, Boolean filled, double length, double width, double side) {
        super(color, filled, length, width);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        super.setWidth(side);
        super.setLength(side);
    }
    public void setWidth ( double side ) {
        setSide(side);
    }

    public void setLength ( double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
