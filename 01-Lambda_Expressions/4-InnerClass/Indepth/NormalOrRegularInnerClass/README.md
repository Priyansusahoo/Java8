# Why Lambda Exp ?
# Use case e.g - Procedure as an argument in the constructor using lambda Expression.

## Only applicable modifiers for Outer Classes are:
            - public
            - default
            - final
            - abstract
            - strictfp (obsolete) ("Strict floating pouint") (In Java 17 no longer needed)

## Only applicable modifiers for Inner Classes are:
            - private
            - protected
            - static

# (Imp) Difference between Anonymous Inner Class and Lambda Expressions

| Anonymous Inner Class | Lambda Expressions |
|-----------------------|--------------------|
| It is a class without name | It is a function without name - Anonymous Function |
| Anonymous Inner class can extend abstract and concret class - can extends only one class | Lambda Exp can't extend abstract or concret class - only one i.e a functional Interface |
| Anonymous Inner class can extends an Interface containing any number of abstract methods | Lambda Exp can implement an interface which contain single abstract method only. (Functional Interface) |
| Inside Anonymous Inner class, we can decalre Instance Variable | We can't decalre instance variable, if we declare a variable it is treated a local variable - check Case5-IMP |
| Anonymous Inner class can be Instantiated | Lambda Expressions cannot be Instantiated |
| Inside Anonymous Inner class, `this` always refers current Anonymous Inner class object but not Outer class Object. | Inside Lambda Exp, `this` always refers to current Outer class Object, i.e "enclosing class object" |
| Anonymous Inner class is best choice if we want to handle multiple methods. | Lambda Exp is the best choice if we want to handle interface with single abstract method (Functional Interface). |
| For Anonymous Inner class, at the time of compilation, a separate .class file will be genreated. `Outer$Inner.class` | For Lambda Exp. at the time of compilation no separate .class file will be generated. |
| Memory will be allocated on demand whenever, we use are creating object. | Lambda Expressions will reside in permanent memory of JVM (Method Area). |


# NOTE -
     Anonymous Inner Class != Lambda Expressions






# Case6

If we try to invoke Lambda Exp. from outside, then:

- The local variables(`y`) referenced from lambda experission are final or implicitly act as final. But not Instance Variables.


NOTE -
- If you are not using local variable in lambda expression then it is NOT `Final` implicitly.
- Local Varibles will be freezed.
- Inside the Lambda Exp. or Outside the Lambda Exp. we can't change the value of Local variables referenced from Lambda Experssion.

Example 1:
```java
class Test {
    int x = 10;
    public void m2() {
        int y = 20; // `Final` by default if referenced from Lambda Exp.
        Infra i = () -> {
            System.out.println(x); // 10
            System.out.println(y); // 20
        };
        i.m1();
    }

    public static void main(String[] args){
        Test t = new Test();
        t.m2();
    }
}

interface Infra{
    public void m1();
}
```
Example 2:
```java
class Test {
    int x = 10;
    public void m2() {
        int y = 20; // `Final` by default as It is local variable
        Infra i = () -> {
            System.out.println(x); // 10
            System.out.println(y); // 20

            x = 888; // this will work because it's not local variable
            y = 999; // will THROW Compile-Time Exception (CE)
            /**
             * CE - local variables referenced from lambda exp. must be final or effectively final.
             */

        };
        i.m1();
    }

    public static void main(String[] args){
        Test t = new Test();
        t.m2();
    }
}

interface Infra{
    public void m1();
}
```


# Advantages of Lambda Exp.
    - Concise Code
    - reduce Complexity
    - functional style

# Indepth Advantages:

    - We can enable functional programming in java
    - we can reduce length of the code so that readability will be improved.
    - we can resolve complexity fo Anonymous Inner classes until some extend.
    - we can handle procedures / functions just like values.
    - we can pass procedures / functions as arguments.
    - Easier to use updated APIs and Libraries.
    - Enable support for parallel processing.



