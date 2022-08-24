/*
 * *INCOMPLETE*
 * 
 * Given a string, split it into as few strings as possible such that each string is a palindrome
 */

public class p181palindromesplit{
    //Method to check if a string is a palindrome
    public static String[] checkPalindrome(String str){
        String[] rev = {""};
        char[] chars = str.toCharArray();
        String temp = "";
        for (int i = 0; i < chars.length; i++){
            temp = temp + chars[i];
        }
        System.out.println(chars);
        return rev;
    }
    public static boolean isPalindrome(String str){
        String rev = "";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)){
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args){
        String str = "racecarannakayak";
        str = str.toLowerCase();
        String[] checkStr = checkPalindrome(str);
        //System.out.println(checkStr);
    }
}