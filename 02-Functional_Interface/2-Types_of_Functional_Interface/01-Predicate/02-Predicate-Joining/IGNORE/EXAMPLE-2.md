# Example-2 - To remove null values and Empty string from the given list

```java
import java.util.function.Predicate;
import java.util.List;
import java.util.LinkedList;
class Main {
    public static void main(String[] args) {       
        
        Predicate<String> startsWithK = S -> S != null && S.length() > 0 && String.valueOf(S.charAt(0)).equalsIgnoreCase("k");
        
        List<String> elements_1 = new LinkedList<>();
        elements_1.add("Priyansu");
        elements_1.add("Kamui");
        elements_1.add("kakashi");
        elements_1.add(null);
        elements_1.add("");
        elements_1.add("KanekiKen");
        elements_1.add("Luffy");
        
        System.out.println("(List) Strings starting with `K`: ");
        m2(startsWithK, elements_1);
    }
    
    public static void m2(Predicate<String> p, List<String> elements) {
        for(String element : elements) {
            if(p.test(element)) System.out.println(element);
        }
    }
}
```