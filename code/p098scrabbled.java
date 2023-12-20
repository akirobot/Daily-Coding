/*
 * Given a 2D board of characters and a word, find if the word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cells, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * 
 * [A, B, C, E],
 * [S, F, C. S],
 * [A, D, E, E]
 * exists(board, 'ABCCED') returns true,
 * exists(board, 'SEE') returns true,
 * exists(board, 'ABCB') returns false
 */

import java.util.*;

public class p098scrabbled {
    public static void generateMatrix (int x, int y, char[] ch){
        int[][] matrix = new int[x][y];
        int pos = 0;
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                matrix[i][j] = ch[pos];
                System.out.print(ch[pos] +"\t");
                pos++;
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public static List<Character> convertStringToCharList(String str){
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()){
            chars.add(ch);
        }
        return chars;
    }

    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        int x, y;
        String str, characters;
        try{
            do{
                System.out.print("Enter x-size: ");
                str = in.nextLine();
                x = Integer.parseInt(str);
                if (x <= 0){
                    System.out.println("Invalid Y value.");
                }
            }while(x <= 0);
            do{
                System.out.print("Enter y-size: ");
                str = in.nextLine();
                y = Integer.parseInt(str);
                if (y <= 0){
                    System.out.println("Invalid Y value.");
                }
            }while(y <= 0);
            do{
                System.out.print("Enter characters (ABCD etc.): ");
                characters = in.nextLine();
                if (x * y > characters.length()){
                    System.out.println("Not enough characters entered. (" +characters.length() +" entered)");
                }
                if (x * y < characters.length()){
                    System.out.println("Too many characters entered. (" +characters.length() +" entered)");
                }
            }while(characters.length() != x * y);
            char[] ch = new char[characters.length()];
            for (int i = 0; i < characters.length(); i++){
                ch[i] = characters.charAt(i);
            }
            generateMatrix(x, y, ch);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        in.close();
    }
}