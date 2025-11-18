package c6_4;

public class MovablePoint implements Movable {
    private int x;
    private int y ;
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
      return "(" + x + " , " + y + ") speed ( " + xSpeed + " , " + ySpeed + ")";
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

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public int getXSpeed() { return xSpeed; }
    public void setXSpeed(int xSpeed) { this.xSpeed = xSpeed; }

    public int getYSpeed() { return ySpeed; }
    public void setYSpeed(int ySpeed) { this.ySpeed = ySpeed; }


}

