# Predicate Functional Interface

#### [First Go through the Introduction](../00-Intro/README.md)

1. Introduced in Java `1.8` .

2. Present in `java.util.function` -> `java.util.function.Predicate`.

3. returns a `boolean` based on a condition.

4. We can use `Predicate` to refer Lambda Expressions.

5. Contains `boolean test(T t)` abstract method.

    ```java
    interface Predicate<T> {
        boolean test(T t);
    }
    ```

## For proper understanding go through the below examples

### [Example 1 - To check if a number is greater than `10` or not.](./IGNORE/EXAMPLE-1.md)

### [Example 2 - Check if a String length is greater than 5](./IGNORE/EXAMPLE-2.md)

### [Example 3 - Check if a given collection is empty or not](./IGNORE/EXAMPLE-3.md)


## [NEXT Chapter --->](../02-Predicate-Joining/README.md)