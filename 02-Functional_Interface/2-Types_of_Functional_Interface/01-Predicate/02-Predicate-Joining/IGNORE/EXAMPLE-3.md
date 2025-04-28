# Program for User Authentication by using Predicate

### Example 1 Code

`Main.java`
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


### Example 2 Code
`Main.java`
```java
import java.util.function.Predicate;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        
        Predicate<User> p = Obj -> Obj.username.equals("priyansu") && Obj.pwd.equals("pwd");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USername");
        String username = sc.next();
        System.out.println("Enter password");
        String password = sc.next();
        
        User u = new User(username, password);
        
        if(p.test(u)) {
            System.out.println("Valid User");
        } else {
            System.out.println("InValid User");
        }
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
