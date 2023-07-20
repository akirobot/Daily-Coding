/*
 * Given each letter in the alphabet is assigned a number, a=1, b=2, ... z=26, and an encoded message, count the number of ways that the message can be decoded. Assume that the messages are decodable, so 001 is not a valid message.
 */

public class p007messagedecoder {
    public static int decoder(String message){
        //Double zero check since it is not possible to have two zeroes next to each other given the encoding
        if (message.contains("00")){
            System.out.println("Invalid message");
            return 0;
        }
        
        return 0;
    }
    public static void main (String[] args){
        System.out.println(decoder("100"));
    }
}
