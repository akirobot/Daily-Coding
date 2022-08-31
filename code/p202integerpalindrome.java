/*
 * Write a program that checks whether an integer is a palindrome. Do not convert the integer into a string.
 * 
 * Essentially, this method is working by extracting the last integer by taking it as the remainder, making space for it by multiplying the remaining number by 10, then adding it to the end. 
 */

public class p202integerpalindrome {
    public static void intPalindrome(int check){
        //Initialization of in-method variables;
        int r = 0;
        int sum = 0;
        int temp = check;
        //While the check is greater than zero
        while (check > 0){
            //Get the remainder from check
            r = check%10;
            //Multiply the sum by 10 and add the remainder
            sum = (sum*10) + r;
            //Divide check by 10
            check = check / 10;
            System.out.println(r +", " +sum +", " +check +", " +temp);
        }
        //If the temp (check) is equal to the sum, the integer is a palindrome, if not, then not
        if (temp == sum){
            System.out.println("palindrome");
        }
        else
            System.out.println("not palindrome");
    }
    public static void main(String[] args){
        intPalindrome(121);
        intPalindrome(888);
        intPalindrome(678);
    }
}
