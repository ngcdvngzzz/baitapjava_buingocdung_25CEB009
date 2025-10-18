public class bai21next {
    private String name;
    private bai21 author;
    private double price;
    private int qty;
    public bai21next (String name , bai21 author , double price  ) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }
    public bai21next (String name , bai21 author , double price , int qty ) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public bai21 getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    @Override
    public String toString() {
        return "bai21next [name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
    }
    
}
