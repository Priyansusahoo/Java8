# Program to Check Whether User is allowed into Pub or not?

```java
import java.util.function.Predicate;

class Main {
    public static void main(String[] args) {
        User[] list = {
                       new User("priyansu", 23, false),
                       new User("Jewel", 22, true),
                       new User("Swayam", 17, false),
                       new User("Ujjawal", 18, true),
                       new User("Thanos", 19, true),
                       new User("Luffy", 19, false)
                      };
                      
        Predicate<User> allowed = Obj -> Obj.age >= 18 && Obj.hasGirlfriend == true;
        
        for (User u : list) {
            if (allowed.test(u)) {
                System.out.println(u.name + " allowed in Pub");
            }
        }
    }
}
class User {
    Integer age;
    String name;
    Boolean hasGirlfriend;
    
    User (String name, int age, boolean hasGirlfriend) {
        this.name = name;
        this.age = age;
        this.hasGirlfriend = hasGirlfriend;
    }
}
```