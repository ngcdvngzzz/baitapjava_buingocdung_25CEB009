package c4_5;

public class Square extends Rectangle {
    private double side ;
    public Square () {

    }
    public Square(double side) {
        super(side, side);
        this.side = side;
    }


    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
        this.side = side;
    }
    public void setWidth ( double side ){
        setSide(side);
    }
    public void setLength ( double side ) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "Rectangle =" + super.toString() +
                ",side=" + side +
                '}';
    }
}
