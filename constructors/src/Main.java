public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Customers newCustomer = new Customers("Priyansu", "priyansusahoo1@gmail.com");
        System.out.println(newCustomer.getName());
        System.out.println(newCustomer.getCreditLimit());
        System.out.println(newCustomer.getEmail());
    }
}