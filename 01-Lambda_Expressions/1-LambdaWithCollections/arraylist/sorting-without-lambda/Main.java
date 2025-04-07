import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        ArrayList<Integer> list = new ArrayList<>(); // List
        
        // List
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Before Sorting " + list); // default insertion order
        
        Collections.sort(list, new DescComparator()); // sorts - using custom Comparator Implemention
        
        System.out.println("After Sorting " + list); // descending
    }
}

class DescComparator implements Comparator<Integer> {
    /*@Override
    public int compare(Integer i1, Integer i2) { // replaced with concise code
        if(i1 > i2) {
            return -1;
        } else if (i1 < i2) {
            return +1;
        } else {
            return 0;
        }
    }*/

    
    @Override
    public int compare(Integer i1, Integer i2) {
        return (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0; // Ternery-operator
    }
}