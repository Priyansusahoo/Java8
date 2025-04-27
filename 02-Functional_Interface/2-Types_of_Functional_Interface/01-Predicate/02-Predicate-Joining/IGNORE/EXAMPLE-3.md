# Program for User Authentication by using Predicate

### `Basic` Code

```java
import java.util.function.Predicate;


class Main {
    public static void main(String[] args) {
        
        Predicate<User> p = Obj -> Obj.username.equals("priyansu") && Obj.pwd.equals("pwd");
        
        User u1 = new User("priyansu", "pwd");
        
        User u2 = new User("Dinesh", "pwd1");
        
        System.out.println(p.test(u1));
        System.out.println(p.test(u2));
    }
}

class User {
    public String username;
    
    public String pwd;
    
    
    User(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }
}
```


### 'Advanced' Code

```java
```
