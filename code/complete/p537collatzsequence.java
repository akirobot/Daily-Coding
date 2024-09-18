package complete;
/*
 * A Collatz sequence in mathematics can be defined as follows. Starting with any positive integer:
 *  - If n is even, the next number in the sequence is n / 2.
 *  - If n is odd, the next number in the sequence is 3n + 1.
 * It is conjectured that every such sequence eventually reaches the number 1. Test this conjecture.
 * 
 * Bonus: What input n <= 1000000 gives the longest sequence.
 */

import java.util.*;

public class p537collatzsequence {
    static int count = 0;
    public static void collatz(int num){
        if (num == 1){}
        else {
            if (num % 2 == 0){
                System.out.print(num/2 + " ");
                count++;
                collatz(num/2);
            }
            else {
                System.out.print((3 * num) + 1 + " ");
                count++;
                collatz((3 * num) + 1);
            }
        }
    }
    public static void collatzNoPrint(int num){
        if (num == 1){}
        if (num % 2 == 0){
            count++;
            collatzNoPrint(num/2);
        }
        else {
            count++;
            collatzNoPrint((3 * num) + 1);
        }
    }
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a positive integer: ");
        String num = in.nextLine();
        int n = Integer.parseInt(num);
        do{
            if (n < 0){
                System.out.println("Not a positive integer.");
            }
            else{
                collatz(n);
                break;
            }
        }while(n > 0);
        in.close();
     
        System.out.println(" "); 
        int high = 0;
        int highCount = 0;
        for (int i = 1; i <= 1000000; i++){
            count = 0;
            collatzNoPrint(i);
            if (count > highCount){
                highCount = count;
                high = i;
            }
        }
        System.out.println(high +" required " +highCount +" integers");
    }
}
