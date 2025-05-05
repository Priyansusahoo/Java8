# Program to remove spaces present in the given String by using `Function` functional interface

```java
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        Function<String, String> f = S -> {
            
            StringBuilder sb = new StringBuilder();
            for(char c : S.toCharArray()) {
                if (c != ' ') {
                    sb.append(c);
                }
            }
            return sb.toString();
        };
        
        System.out.println(f.apply("Priyansu Sahoo"));
    }
}
```

## Concise Code :

```java
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        Function<String, String> f = S -> S.replaceAll(" ", "");
        
        System.out.println(f.apply("Priyansu Sahoo"));
    }
}
```