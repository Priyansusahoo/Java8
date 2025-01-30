@FunctionalInterface
interface Interf{
    public void m1();
}
class Main {
    public static void main(String[] args) {
        Interf i = () -> System.out.println("Lambda Expression called using functional Interface.");
        
        i.m1();
    }
}