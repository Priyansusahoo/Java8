# Predicate Joining

### [Prerequisite knowledge](../01-Basic/README.md)

Let's say we have 2 predicate `p1` & `p2`

1. `p1` : If a given number is greater than 10?

2. `p2` : If a given number is even number?

#### Case 1 -
If we want opposite of a predicate we can use `negate()`. 

- Example - `p1.negate()` what this will do is use `not` i.e for `p1` the condition will be more like "if a given number is `not` greater than 10?"

#### Case 2 -
Now, Let's come to the real thing
- If we want to use `p1` and `p2` together i.e if we want to check if "A given number is greater than 10 and even number?"
- for that we can use `p1.and(p2)` which will create a single predicate and check if both condition satisfy. 

#### Case 3 -
If we want at least one condition to satisfy, then for that we can do
- `p1.or(p2)`


## NOTE - 

`negate()`, `and()`, and `or()` are default methods inside `Predicate` Functional interface.

And `test()` is abstract method.

## Code

```java
import java.util.function.Predicate;
class Test {
    public static void main(String[] args) {
        int[] x = {0,5,15,20,25,1,30};
        
        Predicate<Integer> p1 = I -> I > 10; // no. greater than 10
        Predicate<Integer> p2 = I -> I % 2 == 0; // no. even?
        
        System.out.println("The number greater than 10 are");
        m1(p1, x);
        
        System.out.println("The number `not` greater than 10 are");
        m1(p1.negate(), x);
        
        System.out.println("The number greater than 10 `and` even are");
        m1(p1.and(p2), x);
        
        System.out.println("The number greater than 10 `or` even are");
        m1(p1.or(p2), x);
        
        System.out.println("The number not greater than 10 `or` even are");
        m1(p1.or(p2).negate(), x);
    }
    public static void m1(Predicate<Integer> p, int[] x){
        for(int element : x) {
            if(p.test(element)) System.out.println(element);
        }
    }
}
```



## For proper understanding go through the below examples

#### [Example-1 - Program to display names starts with '`K`' by using `Predicate`](./IGNORE/EXAMPLE-1.md)

#### [Example-2 - To remove null values and Empty string from the given list](./IGNORE/EXAMPLE-2.md)