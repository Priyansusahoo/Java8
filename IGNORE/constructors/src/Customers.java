public class Customers {
    private final String name;
    private final double creditLimit;
    private final String email;

    public Customers() {
        this("human", "email@gmail.com");
        System.out.println("No-args constructor called after calling All-Args constructor!");
    }

    public Customers(String name, String email) {
        this(name, 134982D, email);
        System.out.println("Args constructor called with 2 values 'name' and 'email'! ");
    }

    public Customers(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("All-Args constructor called!");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
