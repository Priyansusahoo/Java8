interface Interf{
    public void m1();
}
class Demo implements Interf {
    public void m1() {
        System.out.println("Normal Implementation");
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Interf i = new Demo();
        i.m1();
    }
}