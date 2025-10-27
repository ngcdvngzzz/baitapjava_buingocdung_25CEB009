public class Account {
    private int id;
    private Customer5 customer;
    private double balance ;
    public Account ( int id , Customer5 customer , double balance) {
        this.id=id;
        this.customer= customer;
        this.balance= balance;
    }
    public Account (int id , Customer5 customer ) {
        this.id= id;
        this.customer = customer;
        this.balance =0.0;
    }

    public int getId() {
        return id;
    }

    public Customer5 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }
    public String getCustomerName () {
        return customer.getName();
    }
    public Account deposit ( double amount ) {
            balance += amount;
        return this;
    }
    public Account widthdraw ( double amount ) {
        if ( balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println( " amount ...");
        }
        return this;
    }
}
