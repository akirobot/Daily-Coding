package complete;
/*
 * Given an array of integers, write a function to determine whether an array could become non-decreasing by modifying at most 1 element.
 * 
 * For example, given the array [10, 5, 7] you should return true, since we can modify the 10 into a 1 to make the array non-decreasing.
 * 
 * Given the array [10, 5, 1], you should return false, since we can't modify any one element to get a non-decreasing array.
 */

public class p556nondecreasingarray {
    public static boolean arrayCheck (int[] array){
        //I used a try-catch to make sure to stop at the index out of bounds that would occur on the last element.
        try {
            //Track the number of decreasing elements
            int decreasing = 0;
            for (int i=0; i < array.length; i++){
                //For each element, if the next element is larger, it will result in a negative number. If the number is smaller, it will be above zero and therefore decreasing.
                if (array[i] - array[i+1] > 0){
                    decreasing++;
                }
                //If the number of decreasing elements is ever greater than one, stop and return, we don't need to check the rest.
                if (decreasing > 1){
                    return false;
                }
            }
        } catch (Exception e) {
            //The exception doesn't need to be handled because the last element does not need to be checked if it is decreasing or increasing.
        }
        return true;
    }
    public static void main(String[] args){
        int[] test = {10, 5, 1};
        if(arrayCheck(test)){
            System.out.println("The array can be modified by changing one element.");
        }
        else{
            System.out.println("The array can't be modified by changing one element.");
        }
    }
}
