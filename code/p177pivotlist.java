/*
 * Given a linked list and a positive integer k, rotate the list clockwise around k
 */

import java.util.*;

public class p177pivotlist {
    public static void pivot(LinkedList<Integer> linkList, int pivot){
        ////Create temp linked list
        LinkedList<Integer> tempLL = new LinkedList<Integer>();
        //Iterate to 
        for (int i = 0; i < pivot; i++){
            tempLL.add(linkList.poll());
        }
        for (int j = 0; j <= tempLL.size()+1; j++){
            linkList.add(tempLL.poll());
        }
        System.out.println(linkList);
    }

    public static void main(String[] args){
        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        ll1.add(7);
        ll1.add(7);
        ll1.add(3);
        ll1.add(5);
        pivot(ll1, 2);

        LinkedList<Integer> ll2 = new LinkedList<Integer>();
        ll2.add(1);
        ll2.add(2);
        ll2.add(3);
        ll2.add(4);
        ll2.add(5);
        pivot(ll2, 3);

        LinkedList<Integer> ll3 = new LinkedList<Integer>();
        ll3.add(1);
        ll3.add(2);
        ll3.add(3);
        ll3.add(4);
        ll3.add(5);
        ll3.add(6);
        pivot(ll3, 3);
    }
}
