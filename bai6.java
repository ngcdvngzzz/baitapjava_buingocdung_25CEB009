public class bai6 {
    private String id;
    private String name;
    private int balance;
    public bai6(String id, String name) {
        this.id=id;
        this.name=name;
        this.balance=0;
    }
     public bai6(String id, String name, int balance) {
        this.id=id;
        this.name=name;
        this.balance=balance;
     }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void credit(int amount) {
            balance += amount;
    }
    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }
    public void transferTo(bai6 another, int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }
    public String toString() {
        return "bai6[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
     

}
