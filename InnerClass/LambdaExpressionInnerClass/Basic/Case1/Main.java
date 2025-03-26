// Online Java Compiler
// Use this editor to write, compile and run your Java code online

interface Test {
    public void m1();
}

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        Test t = () -> {
            System.out.println("anonymous class implementing test interface, invoked using lambda Exp");
        };
        
        t.m1();
    }
}