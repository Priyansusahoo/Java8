@FunctionalInterface
interface Interf{
    public void add(int a, int b);
}
class Demo implements Interf {
    @Override
    public void add (int a, int b){
        System.out.println("Sum is " + (a + b));
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Interf i = new Demo();
        i.add(1,2);
    }
}