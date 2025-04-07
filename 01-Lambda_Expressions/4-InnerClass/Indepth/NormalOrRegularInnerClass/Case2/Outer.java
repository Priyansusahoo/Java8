/**
 * Case-2
 * Accessing variable of Outer, Inner class and m1()
 */
class Outer {
    int x = 10;
    
    class Inner {
        int x = 100;
        public void m1(){
            int x = 1000;
            System.out.println("method Local " + x); // OP - 1000
            
            // -------START------------
            System.out.println("Inner Class " + this.x); // OP - 100
            System.out.println("Inner Class " + Inner.this.x); // OP - 100
            // Both Statements print Inner Class 'x' value
            // --------END-------------
            
            System.out.println("Outer Class " + Outer.this.x); // OP - 10
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Outer - main()");
        new Outer().new Inner().m1();
    }
}