# Static methods inside Interface:

## NOTE -
### - Purpose of Static methods in Interface is to provide general utility methods.


`static` methods by default is not available to implementation class.

Only way to access `static` methods of a Interface from the implementation class is using Interface name and then method name like `Interf.m1()`.

Also there is only one way to access Interface's Static methods in any class i.e same as above (`Interf.m1()`)

Overriding concept not applicable for static methods. e.g - subclass can have a method of same signature as the one in interface - No Issues

## Example - (Accessing static method from implementation class)

 ```java
 class Test implements Interf{

    public static void main(String[] args) {
        
        /**
         *  Case 1 - Wrong way - X
         * 
         * Test test = new Test();
         * test.m1();
         */
        
        /** 
         * Case 2 - Wrong way - X
         * 
         * Test.m1();
         */
        
        /** 
         * Case 3 - Wrong way
         * 
         * m1();
         */


        /** 
         * Case 4 - Correct way
         */
        Interf.m1();
        
    }
    
    @Override
    public void m2(){
        // empty implementation
    }
}

@FunctionalInterface
interface Interf {

    public static void m1() { // ---------------------------> Accessing this method
        System.out.println("Interface Static Method");
    }
    
    public void m2();

    public default void m3() {
        System.out.println("default Method - m3() - Interf");
    }
}
 ```





## Few Cases for Clarification
Case 1 -

`m1()` -  same signature as parent

Perfectly Valid - Overriding concept not applicable here

```java
class Test implements Interf {
    public static void main(String[] args) {        
    }
    
    public static void m1(){ // ------------- this line
    }
}

interface Interf{
    public static void m1(){
    }
}
```

Case 2 -

`m1()` - non-static

Perfectly valid for this scenerio if same method `m1` is present in `Test` class which is `non-static`. Overriding concept not applicable

But in  case of regular parent class if this happens `Compile time error` will occur saying `static` method cannot be overidden as `non-static`

```java
class Test implements Interf {
    public static void main(String[] args) {        
    }
    
    public void m1(){ // ------------- this line
    }
}

interface Interf{
    public static void m1(){
    }
}
```

Case 3 -

`m1()` - private

Perfectly valid for this scenerio cause no overriding concept applicable.

But not ok for regular classes as overriding concept is applicable there. And one cannot reduce the scope of a methods as defined in parent.



```java
class Test implements Interf {
    public static void main(String[] args) {        
    }
    
    private static void m1(){ // ------------- this line
    }
}

interface Interf{
    public static void m1(){
    }
}
```


## main() in interface

After Java `1.8` we can declare `static` method in interface which includes `main()`, and we can execute it as well.

```java
interface Interf{
    public static void main(String[] args) {   
        System.out.println("Interface main()");
    }
    
    public static void m1(){
    }
}
```