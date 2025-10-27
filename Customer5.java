public class Customer5 {
    private int id;
    private String name;
    private char gender;
    public Customer5 ( int id , String name , char gender) {
        this.id=id;
        this.name= name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer5{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
