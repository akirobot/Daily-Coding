/*
 * INCOMPLETE
 * 
 * Given an array of positive integers, divide the array into two subsets such that the difference between the sum of the subsets is as small as possible.
 */

public class p186smallestsubset{
    public static void subsetDivide(int[] posArray){
        int[] tempSubset1 = {};
        int[] tempSubset2 = {};
        int[] tempSubset3 = {};
        int[] tempSubset4 = {};
        subsetDivide1and4(posArray, tempSubset1, tempSubset4);
    }
    public static void subsetDivide1and4(int[] posArray, int[] tempSubset1, int[] tempSubset4){
        for (int i = 0; i < posArray.length; i++){
            tempSubset1[0] = posArray[i];
            
        }
    }
    public static void subsetDivide2and3(int[] posArray){

    }
    public static void main (String[] args){
        int[] subset = {5, 10, 15, 20, 25};
        subsetDivide(subset);
    }
}