/*
 *  INCOMPLETE
 * 
 *  Given an array and a number k that's smaller than the length of the array, rotate the array to the right k elements in-place.
 */

public class p197rotatearray {
    public static void rotateArray(int[] array, int pivot){
        if (pivot < 0 || pivot > array.length){
            System.out.println("Pivot is out of range for array");
        }

    };
    public static void main (String[] args){
        int[] array = {5, 15, 10, 2, 6, 4};
        
        int pivot = 2;
        rotateArray(array, pivot);
    }
}
