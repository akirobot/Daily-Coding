package complete;
/*
 * Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as a single count and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A"
 * 
 * Implement run-length encoding and decoding. You can assume the string to be encoded, have no digits, and consist solely of alphabetic characters.
 * 
 * 
 * Iterate through the string per character, run a count on each charater. When it changes, reset the count, concatenate to the final string.
 */

import java.util.*;

public class p541runlengthencoder {
    public static String encoder(String n){
        //Initialize variables
        char last = n.charAt(0);
        char current = 0;
        int count = 0;
        String encoded = "";
        //For-loop set to the length of the given string
        for (int i = 0; i < n.length()+1; i++){
            //Try-catch to catch index out of bounds error, while also allowing the last character to be added to the final string
            try{
                //Set current char to current position
                current = n.charAt(i);
                //If the two characters are the same, add to the count
                if (current == last){
                    count++;
                }
                //If they aren't, concatenate the current count and the last character to the final string, then set the current to last and reset the count
                //You reset to 1 not 0 to account for the character you moved
                else {
                    encoded = encoded + count + last;
                    last = current;
                    count = 1;
                }
            //Add the last character to the final string, since a StringIndexOutOfBounds error would stop the loop prematurely
            }catch(Exception e){
                encoded = encoded + count + last;
            }
        }
        //Return the final string
        return encoded;
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String n = in.nextLine();
        System.out.println(encoder(n));
        in.close();
    }    
}
