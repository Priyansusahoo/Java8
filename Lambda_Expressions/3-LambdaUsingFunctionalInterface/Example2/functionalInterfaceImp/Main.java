@FunctionalInterface
interface Interf{
    public void add(int a, int b);
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Interf i = (a,b) -> System.out.println("Sum is " + (a+b));
        i.add(1,2);
    }
}