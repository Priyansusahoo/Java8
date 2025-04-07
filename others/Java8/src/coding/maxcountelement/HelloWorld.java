package coding.maxcountelement;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.HashMap;
import java.util.Set;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {1,2,1,5,6,7,7,7,7,7,4,3,2,2,2,5};
        int maxFeq = maximumFrequency(arr);
        System.out.println(maxFeq);

    }
    public static int maximumFrequency(int[] array){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<array.length;i++){
            if(hm.containsKey(array[i])){
                int count = hm.get(array[i]);
                hm.put(array[i], count + 1);
            } else {
                hm.put(array[i], 1);
            }
        }
        Set<Integer> keyList = hm.keySet();
        int maxCount = 0;
        int maxCountElement = 0;
        for (int currentElement : keyList){
            int currentCount = hm.get(currentElement);
            if(currentCount > maxCount){
                maxCount = currentCount;
                maxCountElement = currentElement;
            }
        }
        return maxCountElement;
    }
}