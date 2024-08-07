/*
 * You have an N by N board. Write a function that, given N, returns the number of possible arrangements of the board where N queens can be placed on the board without threatening each other, i.e. no two queens share the same row, column or diagonal.
 * 
 * There is probably a mathematical way to approach this, but it seems easier to just chart out each variant that is possible.
 * 
 */

import java.util.Scanner;

public class p038queensboard {
    public static void queensboard(String N){
        
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        boolean isValid = false;
        do{
            System.out.print("Enter size:");
            String n = in.nextLine();
            try{
                int d = Integer.parseInt(n);    
                in.close();
            }catch(NumberFormatException e){
                System.err.println("Please enter an integer.");
                isValid = false;
            }
        }while(!isValid);
        
    }
}
