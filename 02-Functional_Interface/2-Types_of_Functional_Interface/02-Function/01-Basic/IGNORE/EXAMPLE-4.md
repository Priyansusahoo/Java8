# Program to count number of spaces present in the given String by using `Function` functional interface

```java
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        Function<String, Integer> f = S -> {
            int count = 0;
            for(char c : S.toCharArray()) {
                if (c == ' ') {
                    count++;
                }
            }
            return count;
        };
        
        System.out.println(f.apply(" Priyansu Sahoo XYZ "));
    }
}
```
## Concise Code :

```java
import java.util.function.Function;
class Main {
    public static void main(String[] args) {
        Function<String, Integer> F = S -> S.length() - S.replaceAll(" ", "").length();
        
        System.out.println(F.apply(" Priyansu Sahoo XYZ "));
    }
}
```