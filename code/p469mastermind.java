/*
 * Mastermind is a two-player game in which the first player attempts to guess the secret code of the second. In this version, the code may be any six-digit number with all distinct digits. Each turn, the first player guesses some number, and the second player responds by saying how many digits in this number correctly matched their location in the secret code.
 * Write an algorithm which, given a sequence of guesses, and their scores, determines whether there exists some secret code that could have produced them.
 */

import java.util.*;

public class p469mastermind {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[42m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";

    public static final int secretCode = 123;

    public static boolean mastermind(int code){
        char[] charCode = ("" + code).toCharArray();
        char[] charSecret = ("" + secretCode).toCharArray();
        String strSecret = String.valueOf(secretCode);
        //Check if code entered is valid
            //Check if code entered is too long
            //Check if code entered contains multiple instances of a number
        //Check if code entered and secret code are the same
        if (code == secretCode){
            System.out.println(ANSI_GREEN +code +ANSI_RESET);
            System.exit(0);
            return true;
        }

        else {
            for (int i = 0; i < charCode.length; i++){ 
                if (charCode[i] == charSecret[i]){
                    System.out.print(ANSI_GREEN +charCode[i]);
                    continue;
                }
                else{
                    if (strSecret.contains((String.valueOf(charSecret[i])))){
                        System.out.print(ANSI_YELLOW +charCode[i]);
                        continue;
                    }
                    else {
                        System.out.print(ANSI_RED +charCode[i]);
                        continue;
                    }
                }   
            }
            return false;
        }
    }
    public static void main (String[] args){
        int testCode = 0;
        boolean result = false;
        do{
            Scanner in = new Scanner (System.in);
            testCode = Integer.valueOf(in.nextLine());
            System.out.println("");
            result = mastermind(testCode);
        }while(!result);
    }
}
