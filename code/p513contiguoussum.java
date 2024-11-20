/*
 * Given a list of integers and a number K, return which contiguous elements of the list sum to K.
 * 
 * For example, if the list is [1, 2, 3, 4, 5] and K is 9, then it should return [2, 3, 4] since 2 + 3 + 4 = 9.
 * 
 * - I assume this is checking to see which of the "largest" contiguous elements' sum equals K, rather than the first.
 * - I am also assuming that the list is already sorted lowest to highest and there are no gaps.
 * - Run a check to see which elements (if any) are greater than K, and ignore those.
 * - If K is less than the lowest element return an error.
 */

import java.util.ArrayList;
import java.util.List;

public class p513contiguoussum {
    public static List<Integer> contiguousSum (int K, List<Integer> list){
        List<Integer> sum = new ArrayList<>();
        if(list.get(0) > K){
            System.out.println("The list doesn't contain a sequence that would equal " +K);
            return null;
        }
        for (int i = list.size(); i > 0; i--){
            
        }
        return null;
    }
    public static void main (String[] args){
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        List<Integer> result = contiguousSum (9, intList);
        System.out.println(result);
    }
}