interface Test { // Functional Interface
    public void m1(); // Only one abstract Method
}

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Test t = () -> System.out.println("anonymous class implementing test interface, invoked using lambda Exp"); // Lambda Exp
        
        Test t2 = new Test() { // Anonymous Inner Class
            public void m1() {
                System.out.println("anonymous Inner class implementing test interface");
            }
        };
        t.m1(); // this implements Lambda Exp
        t2.m1(); // this implements Anonymous Inner Class
    }
}