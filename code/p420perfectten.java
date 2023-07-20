/*
 * Given a positive integer n, return the n-th perfect number. A number is "perfect" if its digits summed together equal 10.
 * 
 * 19, 28, 37, 46, 55, 64, 73, 82, 91, 109, 118, 127, 136, 145, 154, 163, 172, 181, 190, 208... 307, 316... 406 1009... 1090, 1108... 9100, 10009
 *  Every 9 digits is a perfect 10.
 *  The minimum is 19, since you can't have two number equal 10 with a single digit.
 *  The maximum is effectively infinite, since you could have any number of zeroes between the first digit and the last, which would add to 10.
 */

import java.util.*;

public class p420perfectten {
    public static int find10s(int n){
        int perfectten = 19;
        int count = 1;
        while (count != n){
            perfectten += 9;
            if (doubleCheck(perfectten)){
                count++;
            }
        }
        return perfectten;
    }
    public static boolean doubleCheck(int check){
        char[] charCheck = String.valueOf(check).toCharArray();
        int sum = 0;
        for (int i = 0; i < charCheck.length; i++){
            sum = Character.getNumericValue(charCheck[i]) + sum;
        }
        if (sum == 10){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main (String[] args){
        long start = java.lang.System.currentTimeMillis();
        int foundint = find10s(4);
        long end = java.lang.System.currentTimeMillis();
        System.out.println("Got " +foundint +" in " +(end-start) +"ms");
    }
}