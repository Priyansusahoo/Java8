## Example 1

To check if a number is greater than `10` or not.

Normal java code:

```java
    (Integer I) -> {
        if(I > 10){
            return true;
        }
        else{
            return false;
        }
    }
```


Concise code of above in context to Predicate:

```java
(I) -> I>10;
```

#### How to use it:

`Predicate` includes `test()` method so we need to provide context and invoke it.

```java
package java.util.function;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
```

Providing Context:

`Predicate<Integer> p = I -> I>10;` what this does is it changes `test(T t)` to Integer i.e `T` -> `Integer` and condition is `I>10`

How to Invoke:

Then we invoke it like `p.test(100)` 

Example -
```java
import java.util.function.Predicate;
class Main {
    public static void main(String[] args) {
        Predicate<Integer> p = I -> I>10;
        System.out.println(p.test(100)); // true
        System.out.println(p.test(5)); // false
        // System.out.println(p.test("priyansu)); // will throw Compile-time error - `Incompatable types`
    }
}
```