# `Function` functional interface

- Package `java.util.function.Function;`
- Unlike Predicate where it performs condition check and return boolean value, here Function can return any type of value as we mention i.e `R`
- Function interface contains `apply()` abstract method.
    - `T` is input Paramater.
    - `R` is return type.

```java
interface Function<T, R> {
    R apply(T t);
}
```






## Example - 1 : Return length of a given String.
```java
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        Function<String, Integer> f = S -> S.length();
        
        System.out.println(f.apply("Sahoo"));
    }
}
```





## Example - 2 : Square of a number
```java
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        Function<Double, Double> f = I -> Math.pow(I, 2);
        
        System.out.println(f.apply(5.0));
    }
}
```



# Difference between `Predicate` and `Function` functional Interface

| Predicate | Function |
| ----------- | ---------- |
| To implement conditional checks and return some boolean value, we should go for `Predicate`. | To perform certain operation and to return some result we should go for `Function`. |
| Predicate can take one type parameter which represents input argument type. `Predicate<T>` | Function can take 2 type parameters. First one represent input argument type and second one represent return type. `Function<T, R>` |
| Predicate Interface defines one abstract method called `test()` | Function Interface defines one abstract method called `apply()` |
| `public boolean test(T t)` | `public R apply(T t)` |
| Predicate can return only boolean value | Function can return any type of value |