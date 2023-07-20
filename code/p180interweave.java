package complete;
/*
 * Given a stack of N elements, interweave the first half of the stack with the second half reversed using only one other queue. This should be done in-place.
 */

import java.util.*;

public class p180interweave {
    private static void weave(Stack<Integer> stack){
        //Create a linked list to store popped ints
        //Priority queue will re-sort elements as they are added, so we don't use that
        Queue<Integer> ll = new LinkedList<Integer>();
        //Determine half of array based on size, rounded down
        int stackLength = Math.round(stack.size()/2);
        //Pop half of stack elements and add to linked list
        for (int i = 0; i < stackLength; i++){
            int popped = stack.pop();
            ll.add(popped);
        }
        //Iterate through linked list and insert elements
        for (int j = 0; j < stack.size(); j++){
            //If the index is divisible by 2, offset by 1 and insert
            if (j%2 == 0){
                stack.insertElementAt(ll.poll(), j+1);
            }
            //If the linked list is empty after inserting, break
            if(ll.isEmpty()){
                break;
            }
        }
        System.out.println(stack);
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        weave(stack);
    }
}