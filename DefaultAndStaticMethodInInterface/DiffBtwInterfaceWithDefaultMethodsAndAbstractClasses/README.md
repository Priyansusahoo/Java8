# Diffrence Btw Interface with Default Methods and Abstract Classes

## NOTE - 

Both `Left` and `Right` Interface has method `m1`, So if we try to create a class which implements `Left` and `Right` interface then we are going to get Compile-Time Expection(CE).

CE - class `Test` inherits unrelated defaults from `Left` and `Right`

we are getting this because of ambiguity issue, so we need to Override and then we can access a particular implementation of default method like for `Left` we can do `Left.super.m1()`, and for `Right` we can do `Right.super.m1()`.

## Example -
```java
class Test implements Left, Right {
    
    public static void main (String[] args) {
        Test t = new Test();
        t.m1();
    }
    
    @Override
    public void m1() {
        System.out.println("Own Implementation");
        Left.super.m1(); // accessing Left Implementation
        Right.super.m1(); // accessing Right Implementation
    }
}

interface Left {
    default void m1() {
        System.out.println("Left default Implementation");
    }
}

interface Right {
    default void m1() {
        System.out.println("Right default Implementation");
    }
}
```



# Diffrence Btw interface with default methods and Abstract classes

| Interface with default method | Abstract class |
| ----------------------------- | -------------- |
| Inside interface every variable is always public, static and final we can not decalre inatance variables. | Inside Abstract class we can decalre instance variables, which are required to the child class. |
| Interface never talks about state of object. | Abstract class can talk about state of object. |
| Inside Interface we can't declare constructors. | Inside abstract class, we can decalre constructor. |
| Inside Interface we can't declare instance and static blocks. | Inside abstract class, we can declare instance & static blocks. |
| Functional Interface with default methods can refer Lambda Expressions. | Abstract class can't refer Lambda Expression. |
| Inside Interface we can't override `Object` class methods e.g: `toString()`, `hashCode()`, `equals()`. | Inside Abstract class we can override `Object` class methods. |



## NOTE - 

        Interface with default methods != Abstract Classes