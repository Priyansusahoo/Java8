# Example - 1 : Return length of a given String.
```java
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        Function<String, Integer> f = S -> S.length();
        
        System.out.println(f.apply("Sahoo"));
    }
}
```