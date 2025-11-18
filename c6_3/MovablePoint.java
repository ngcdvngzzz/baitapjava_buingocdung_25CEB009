package c6_3;

public class MovablePoint implements Movable {
    int x;
    int y ;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int xSpeed, int y, int ySpeed) {
        this.x = x;
        this.xSpeed = xSpeed;
        this.y = y;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    @Override
    public void moveUp() {
       y -= ySpeed;
    }

    @Override
    public void moveDown() {
       y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
       x += xSpeed;
    }
}
