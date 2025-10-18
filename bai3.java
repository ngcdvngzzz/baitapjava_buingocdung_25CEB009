public class bai3 {
    private float length;
    private float width;
    public bai3() {
        length = 1.0f;
        width = 1.0f;
    }
    public bai3(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getArea() {
        return length * width;
    }
    public float getPerimeter() {
        return 2 * (length + width);
    }
    public String toString() {
        return "bai3[length=" + length + ", width=" + width + "]";
    }
}
