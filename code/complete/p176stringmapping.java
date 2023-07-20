package complete;
/*
 * Determine whether there exists a one to one character mapping from one string s1 to another s2
 */

import java.util.*;

public class p176stringmapping {
    //This problem is far simpler than actually mapping any character, all you need to do is check the initial string for duplicates. You do not need to check the second since they can be any value.
    public static boolean mapping(String s1, String s2){
        //Create a character array to store characters from string s1
        char[] chars = s1.toCharArray();
        //Create a map to store characters that are duplicates
        Map<Character, Integer> map = new HashMap<>();
        //Iterate through each character
        for (char c : chars){
            //If the map contains the current character, get the value for the character and increment
            if (map.containsKey(c)){
                int counter = map.get(c);
                map.put(c, ++counter);
            }
            //If the map doesn't contain the character, add it and set the value to 1
            else {
                map.put(c, 1);
            }
        }
        //For each character listed in the map
        for (char c : map.keySet()){
            //If the value is more than 1, return false
            if(map.get(c) > 1){
                return false;
            }
        }
        //Otherwise, return true
        return true;
    }
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "bcd";
        System.out.println(mapping(s1, s2));

        s1 = "foo";
        s2 = "bar";
        System.out.println(mapping(s1, s2));
    }
}
