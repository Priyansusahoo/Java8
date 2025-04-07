# How to write default methods in java:

we can add concret methods in interface in the form of `default` methods.

`default` keyword is used to define a default method a functional Interface and this keyword is not a access modifier as shown in `Example 1`

`default` methods in the interface can be overridden as shown in `Example 2`

## Example 1 -


```java
class Test implements Interf{
    public static void main(String[] args) {
        Test test = new Test();
        test.m1();
    }
}

interface Interf{
    default void m1(){
        System.out.println("default methods in Interf interface");
    }
}
```

## OutPut: 

        default methods in Interf interface


## Example 2 -

```java
class Test implements Interf{
    public static void main(String[] args) {
        Test test = new Test();
        test.m1();
    }
    
    @Override
    public void m1(){
        System.out.println("Overriding default methods of Interf interface in Test class");
    }
}

interface Interf{
    default void m1(){
        System.out.println("default methods in Interf interface");
    }
}
```

## OutPut: 

        Overriding default methods of Interf interface in Test class