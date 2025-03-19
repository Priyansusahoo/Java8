/**
 * CASE - 2
 * Here we learn how to access m1() of Inner Class from Instance area.
 * Normal / Regular Class
 * Easy to Write - No new syntax used.
 */

class Case2 {

    class Inner // Inner Class
    {
        /* Inner classes cannot have Static methods i.e why main() cannot be written in Inner Class. */
        public void m1()
        {
            System.out.println("Inner class - m1() ");
        }
    }
    
    public void m2() { // m2() is of Case2 Class
        Inner i = new Inner();
        System.out.println("Accessing m1() of inner class from Case2 Class ");
        i.m1();
    }


    public static void main(String[] args) 
    {
        System.out.println("Outer class Case2()");
        Case2 o = new Case2();
        o.m2();
    }
}