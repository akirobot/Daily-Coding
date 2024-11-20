package complete;
/*
 * Given a string and a pattern, find the starting indices of all occurrences of the pattern in the string. For example, given the string "abracadabra" and the pattern "abr", you should return [0, 7].
 * 
 * The question doesn't say whether the pattern needs to be case sensitive, so I will assume that it does.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class p522startingpatterns {
    public static List<Integer> patternIndex(String pattern, String text){
        //Create matcher class for regex pattern
        Matcher matcher = Pattern.compile(pattern).matcher(text);
        //Create arraylist for starting indeces.
        List<Integer> result = new ArrayList<>();
        //While matcher finds results in the given string, add the starting index of each match to the arraylist
        while (matcher.find()){
            result.add(matcher.start());
        }
        return result;
    }
    public static void main (String[] args){
        List<Integer> result = patternIndex("abr", "abracadabra");
        System.out.println(result);
    }
}
