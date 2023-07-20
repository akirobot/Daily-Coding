/*
 * Given a string consisting solely of (, ), and *, where * can represent either a (, ), or nothing, determine whether the parentheses are balanced.
 * 
 * For example, (()* and (*) are balanced, but )*( is not balanced.
 * 
 * Check from both ends. If the first character is a ) or the last is a (, then the string is not balanced, since they can't have a matching pair because the are the first and/or last characters. * is a wild card, it can be either ( or ) or neither. Keep checking all the way to the middle, counting each instance of each character. If the difference between ( and ) can't be made up by the * count, then it is imbalanced.
 *      (**(*)), (*(**), (()(*, ((*)()
 */

import java.util.*;

public class p450balancedparentheses {
    public static boolean balancedString(String n){
        String str[] = n.split("(?!^)");
        int openCT = 0;
        int closedCT = 0;
        int asterCT = 0;
        if (str[0] == ")"){
            return false; 
        }
        else if (str[str.length-1] == "("){
            System.out.println(str[str.length-1]);
            return false;
        }
        return true;
    }
    public static void main (String[] args){
        System.out.println(balancedString("(()*"));
        System.out.println(balancedString("(*)"));
        System.out.println(balancedString(")*("));
    }
}
