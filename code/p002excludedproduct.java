package complete;
/*
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i
 */

import java.util.*;

public class p002excludedproduct {
    public static List<Integer> exProduct(List<Integer> array){
        List<Integer> test = new ArrayList<Integer>();
        for(int i = 0; i < array.size(); i++){
            test.add(getProd(array, i));
        }
        return test;
    }
    public static int getProd(List<Integer> array, int pos){
        int product = 1;
        for(int j = 0; j < array.size(); j++){
            if (j == pos){
                continue;
            }
            product *= array.get(j);
        }
        return product;
    }
    public static void main(String[] args){
        List<Integer> example1 = new ArrayList<Integer>();
        example1.add(1);
        example1.add(2);
        example1.add(3);
        example1.add(4);
        example1.add(5);
        System.out.println(exProduct(example1));

        List<Integer> example2 = new ArrayList<Integer>();
        example2.add(3);
        example2.add(2);
        example2.add(1);
        System.out.println(exProduct(example2));

        List<Integer> example3 = new ArrayList<Integer>();
        example3.add(0);
        example3.add(1);
        example3.add(2);
        example3.add(3);
        example3.add(4);
        example3.add(5);
        System.out.println(exProduct(example3));
    }
}
