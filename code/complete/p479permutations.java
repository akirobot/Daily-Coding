package complete;
/*
 * Given a number in the form of a list of digits, return all possible permutations.
 * 
 * Fairly easy, just generate each combination of numbers
 */

import java.util.*;

public class p479permutations {
    public static <E> List<List<E>> permutations(List<E> original){
        
        if (original.isEmpty()){
            List<List<E>> result = new ArrayList();
            result.add(new ArrayList<>());
            return result;
        }
        E firstElement = original.remove(0);
        List<List<E>> returnValue = new ArrayList<>();
        List<List<E>> permutations = permutations(original);
        for (List<E> smallerPermutated : permutations){
            for (int index = 0; index <= smallerPermutated.size(); index++){
                List<E> temp = new ArrayList<>(smallerPermutated);
                temp.add(index, firstElement);
                returnValue.add(temp);
            }
        }
        return returnValue;
    }
    public static void main (String[] args){
        List<Integer> test = new ArrayList<Integer> ();
        test.add(1);
        test.add(2);
        test.add(3);
        System.out.println(permutations(test));
    }
}