public class bai1 {
    private double radius;
    private String color;
    public bai1() {
        radius =1.0;
        color = "red";
    }
    public bai1(double radius ) {
        this.radius= radius;
        this.color = "red";
    }
    public double getRadius () {
        return radius;
    }
    public double getArea () {
        return radius * radius * Math.PI;
    }
}
