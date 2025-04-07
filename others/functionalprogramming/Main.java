import java.util.*;
import java.util.stream.Collectors;
class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        
        // input  = "aabbbcdd";
        // output = a:2, b:3, c:1, d:2;
        
        String input = "aabbbcddef";
        
        // System.out.println(input.chars());
        
        System.out.println(input.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting())));
        
        Map<Character, Long> mp = input.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        
        // input.chars().mapToObj(c -> (char)c).filter(c -> mp.get(c) == 1).forEach(System.out::println);
        
        // input.chars().mapToObj(c -> (char)c).filter(c -> mp.get(c) == 1).findFirst().ifPresent(System.out::println);
        
        // input.chars().mapToObj(c -> (char)c).filter(c -> mp.get(c) == 1).limit(2).forEach(System.out::println);
        
        input.chars().mapToObj(c -> (char)c).filter(c -> mp.get(c) == 1).limit(3).reduce((a,b) -> b).ifPresent(System.out::print);
    }
}