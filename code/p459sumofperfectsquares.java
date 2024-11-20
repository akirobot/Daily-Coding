/*
 * Write a program that determines the smallest number of perfect squares that sum up to N.
 * 
 * For example:
 *  - Given N = 4, return 1 (4)
 *  - Given N = 17, return 2 (16 + 1)
 *  - Given N = 18, return 2 (9 + 9)
 */

import java.util.*;

public class p459sumofperfectsquares {
    /*public static boolean squareCheck(double sum){
        if (Math.sqrt(sum)%1 == 0){
            return true;
        }
        else{
            return false;
        }
    }*/
    public static int squareSum(double sum){
        int sqNum = 0;
        int sqSum = 0;
        do{
            for (int i = 1; i * i < sum; i++){
                
            }
            sqNum++;
        }while(sqSum != sum);

        return sqNum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.println(squareSum(36));
        }catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        in.close();
    }
}
