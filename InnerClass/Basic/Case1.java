/**
 * CASE - 1
 * Here we learn how to access m1() of Inner Class from static area.
 * Normal / Regular Class
 */
class Case1 {

    class Inner // Inner Class
    {
        /* Inner classes cannot have Static methods i.e why main() cannot be written in Inner Class. */
        public void m1()
        {
            System.out.println("Inner class - m1() ");
        }
    }


    public static void main(String[] args) 
    {
        System.out.println("Outer class Case1()");

        System.out.println("Method-1");
        // Method - 1
        Case1 m = new Case1(); // Case1 Class Object Creation
        Case1.Inner i = m.new Inner(); // Inner reference & create Inner class Obj using Case1 class Object. // HAS-A Relation
        i.m1(); // used Inner reference to access m1()

        System.out.println("Method-2");
        // Method - 2
        Case1.Inner i1 = new Case1().new Inner ();
        i1.m1();
        
        System.out.println("Method-3");
        // Method - 3
        new Case1().new Inner().m1(); // Concise ---> only to access a Inner class method
    }
}