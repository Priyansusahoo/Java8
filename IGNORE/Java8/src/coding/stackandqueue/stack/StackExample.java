package coding.stackandqueue.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();

        stk.add("A");
        stk.add("B");
        stk.add("C");
        stk.add("D");
        stk.add("E");
        stk.add("F");

        stk.pop(); // removes "F" from the stack

        for(String i : stk){
            System.out.println(i);
        }
    }
}
