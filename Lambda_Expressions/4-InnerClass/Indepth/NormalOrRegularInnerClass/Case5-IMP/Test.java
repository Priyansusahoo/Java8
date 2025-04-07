/**
 * NOTE - 
    "Internal Object Store" in not there in Lambda Expression unlike Inner Class where it is available.
    There is no Instance variable kind of thing in Lambda Expressions.
    So In lambda Exp 'this' refers to Outer Class Member.

    Any variables defined inside Lambda Exp is Local Variable only.
    Where as in Case of Inner Class, if we declare a variable inside, it's a Instance Variable.
 */

class Test {
    int x = 888;

    public void m2() {

        Interf i = () -> {
            int x = 999; // Local Variable Not Instance Variable like Inner Class
            
            System.out.println(this.x); // 888 - In Lambda Exp "this" refer to Outer Class members only, In this Case it's Test's 'x' variable in invoked unlike a traditional Inner Class
            
            System.out.println(x); // 999 Invokes local variable
        };
        
        i.m1();
    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Test t = new Test();
        t.m2();
    }
}



interface Interf{
    public void m1();
}