package c6_4;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "(" + center.getX() + "," + center.getY() +
                "), speed=(" + center.getXSpeed() + "," + center.getYSpeed() +
                "),radius=" + radius;
    }


    @Override
    public void moveUp() {
       center.moveUp();
    }

    @Override
    public void moveDown() {
       center.moveDown();
    }

    @Override
    public void moveLeft() {
       center.moveLeft();
    }

    @Override
    public void moveRight() {
      center.moveRight();
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
