## Check if a String length is greater than 5

Solution -

```java
import java.util.function.Predicate;
class Main {
    public static void main(String[] args) {
        Predicate<String> p = S -> S.length() > 5;
        System.out.println(p.test("Sahoo")); // false
        System.out.println(p.test("Priyansu")); // true
    }
}
```


### For Reference
```java
package java.util.function;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
```