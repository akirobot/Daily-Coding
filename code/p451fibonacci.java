/*
 * Implement the function fib(n), which returns the nth number in the Fibonacci sequence, using only O(1) space.
 * 
 * 1 1 2 3 5 8 13 21 34 55 89 144...
 */

import java.util.*;

public class p451fibonacci {
    public static int fib(int n){
        int last = 1;
        int next = 1;
        int sum = 0;
        if (n == 1){
            return 1;
        }
        for (int i = 0; i < n; i++){
            last = next;
            next = sum;
            sum = last + next;
        }
        return sum;
    }
    public static void main (String[] args){
        System.out.println(fib(6));
    }
}