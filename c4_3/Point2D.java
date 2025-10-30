package c4_3;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D () {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setXY ( float x , float y) {
        this.x = x;
        this.y = y;
    }
    public float [] getXY () {
       float [] result = new float[2]  ;
       result[0] = this.x;
       result[1] = this.y;
       return result;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
