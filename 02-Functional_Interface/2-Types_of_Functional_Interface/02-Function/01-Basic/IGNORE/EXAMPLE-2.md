# Example - 2 : Square of a number
```java
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        Function<Double, Double> f = I -> Math.pow(I, 2);
        
        System.out.println(f.apply(5.0));
    }
}
```