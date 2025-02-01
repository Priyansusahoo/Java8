import java.util.*;
/**
 * Collection Overview - List, Map, Set
 */
 
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        ArrayList<String> list = new ArrayList<>(); // List
        HashSet<String> hSet = new HashSet<>(); // Set
        HashMap<String, String> hMap = new HashMap<>(); // Map
        
        // List
        list.add("M");
        list.add("M");
        list.add("P");
        System.out.println(list);
        
        // Set
        hSet.add("M");
        hSet.add("M");
        hSet.add("P");
        System.out.println(hSet);
        
        // Map
        hMap.put("A", "Apple");
        hMap.put("B", "Banana");
        hMap.put("C", "City");
        hMap.put("D", "Demon King");
        
        System.out.println(hMap);
    }
}