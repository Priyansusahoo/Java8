## Check if a given collection is empty or not

Solution -

```java
import java.util.function.Predicate;
import java.util.Collection;
import java.util.List;
import java.util.LinkedList;
class Main {
    public static void main(String[] args) {
        Predicate<Collection> p = C -> C.isEmpty();
        
        List<String> list = new LinkedList<>();
        
        List<String> list_1 = new LinkedList<>();
        list_1.add("Priyansu");
        
        System.out.println(p.test(list)); // true
        System.out.println(p.test(list_1)); // false
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