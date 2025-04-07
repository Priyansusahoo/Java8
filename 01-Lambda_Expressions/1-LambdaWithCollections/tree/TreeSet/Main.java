import java.util.*;
class Main {
    public static void main(String[] args) {
        /*System.out.println("Try programiz.pro");*/
        TreeSet<Integer> ts = new TreeSet<>((i1, i2) -> 
                                        (i1 < i2) ? +1 : (i1 > i2) ? -1 : 0); // pass comparator obj
                                        
        /*TreeSet<Integer> ts = new TreeSet<>(Comparator.reverseOrder());*/ // same as above
        ts.add(10);
        ts.add(0);
        ts.add(15);
        ts.add(25);
        ts.add(5);
        ts.add(20);
        System.out.println(ts);
    }
}