# Using Predicate and Function to grade marks which are greater than 60

```java
import java.util.function.Function;
import java.util.function.Predicate;

class Main {
    public static void main(String[] args) {
        
        int marks = 61; // marks paramater
        
        // Function for grade system
        Function<Integer, String> F = I -> {
            if (I >= 80) return "A";
            else if (I >= 60) return "B";
            else if (I >= 50) return "C";
            else if (I >= 35) return "D";
            else return "E";
        };
        
        // Predicate for checking marks greater than 60
        Predicate<Integer> P = I -> I >= 60;
        
        if (P.test(marks)) {
          System.out.println(F.apply(marks));
        }
    }
}
```