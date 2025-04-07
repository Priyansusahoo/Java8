package coding.stackandqueue.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");
        queue.add("f");

        queue.remove(); // removes "a" from the queue
        for (String i : queue){
            System.out.println(i);
        }
    }
}
