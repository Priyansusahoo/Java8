# Program to display names starts with '`K`' by using `Predicate`

```java
import java.util.function.Predicate;
class Main {
    public static void main(String[] args) {
        String[] elements = {"Priyansu", "Kamui", "kakashi", "KanekiKen", "Luffy"};
        
        
        Predicate<String> startsWithK = S -> String.valueOf(S.charAt(0)).equalsIgnoreCase("k");
        
        System.out.println("Strings starting with `K`: ");
        m1(startsWithK, elements);
    }
    
    public static void m1(Predicate<String> p, String[] elements) {
        for(String element : elements) {
            if(p.test(element)) System.out.println(element);
        }
    }
}
```