package complete;
/*
 * The ancient Egyptians used to express fractions as a sum of several terms where each numerator is one. For example, 4/13 can be represented as 1/4 + 1/18 + 1/468. Create an algorithm to turn an ordinary fraction a / b, where a < b, into its Egyptian notation.
 * 
 * Check if the numerator is a multiple of the denominator by dividing the numerator from the denominator
 * Check 1/2, 1/3, 1/4, 1/5... by seeing if it is greater or less than 4/13
 * Select 1/4 because it is the first lower than 4/13
 * 4/13 * 4 -> 16/52
 * 1/4 * 13 -> 13/52
 * 16/52 - 13/52 = 3/52
 * Check if the numerator is a multiple of the denominator by dividing the numerator from the denominator
 * Check 1/2, 1/3, 1/4, 1/5... The next lowest is 1/18, so use that
 * 3/52 * 18 -> 54/936
 * 1/18 * 52 -> 52/936
 * 54/936 - 52/936 = 2/936
 * Check if the numerator is a multiple of the denominator by dividing the numerator from the denominator
 * 936/2 = 468
 * Final is 1/468
 * Print all results
 */

import java.util.*;

public class p554egyptianexpression {
    public static boolean valid(int numerator, int denominator){
        if (numerator <= denominator){
            return true;
        }
        else {
            return false;
        }
    }
    public static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void egyptianNotation (int numerator, int denominator){
        int gcd = gcd(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
        if (numerator == 1){
            System.out.print(numerator +"/" +denominator);
        }
        else {
            int tempD, tempN = 1;
            for (tempD = 1; ((double) 1/tempD) > ((double) numerator/denominator); tempD++){}
            if (tempN == 1){
                System.out.print(tempN +"/" +tempD);
            }
            tempN = denominator;
            numerator = (numerator * tempD)- tempN;
            tempD = denominator * tempD;
            denominator = tempD;
            System.out.print(" + ");
            egyptianNotation(numerator, denominator);
        }
    }
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        try{
            System.out.print("Enter a numerator:");
            String num = in.nextLine();
            int n = Integer.parseInt(num);
            System.out.print("Enter a denominator:");
            String den = in.nextLine();
            int d = Integer.parseInt(den);
            if (valid(n, d)){
                if (n == 1){
                    System.out.println("Fraction is already in Egyptian notation.");
                }
                else{
                    egyptianNotation(n, d);
                }
            }
            else{
                System.out.println("Invalid fraction entered.");
            }
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        in.close();
    }
}
