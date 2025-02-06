import java.util.*;
class Main {
    public static void main(String[] args) {
        /*System.out.println("Try programiz.pro");*/
        TreeMap<Integer, String> ts = new TreeMap<>((i1, i2) -> 
                                        (i1 < i2) ? +1 : (i1 > i2) ? -1 : 0);  // comparator obj
        
        // TreeMap<Integer, String> ts = new TreeMap<>(); // Natural sorting - in this case acending order for key set

        ts.put(10, "Haki");
        ts.put(0, "Baki");
        ts.put(15, "Hakai");
        ts.put(25, "Goku");
        ts.put(5, "onepiece");
        ts.put(20, "luffy");
        System.out.println(ts);
    }
}