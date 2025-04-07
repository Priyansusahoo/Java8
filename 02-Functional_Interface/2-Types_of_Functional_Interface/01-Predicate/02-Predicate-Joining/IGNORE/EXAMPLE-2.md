# Example-2 - To remove null values and Empty string from the given list

```java
import java.util.function.Predicate;
import java.util.List;
import java.util.LinkedList;
class Main {
    public static void main(String[] args) {       

        String[] elements = {"Priyansu", "Kamui", "kakashi", "KanekiKen", "Luffy"};
        
        Predicate<String> p = S -> S != null && S.length() > 0;
        
        List<String> list = new LinkedList<>();
        
        for(String s : elements) {
            if(p.test(s)) {
                list.add(s);
            }
        }
        
        System.out.println("The list of Valid elements");
        System.out.println(list);
    }
}
```