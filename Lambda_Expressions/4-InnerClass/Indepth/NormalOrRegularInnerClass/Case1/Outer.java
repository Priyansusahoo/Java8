/**
 * Case-1
 * Accessing Static variable of Outer class from Inner class
 */

class Outer {
    int x = 10;
    static int y = 20;
    
    class Inner {
        
        public void m1(){
            System.out.println(x);
            System.out.println(y); // we can access static variable in Inner class but can't declare.
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Outer - main()");
        new Outer().new Inner().m1();
    }
}