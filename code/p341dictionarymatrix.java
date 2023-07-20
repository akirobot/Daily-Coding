/*
 * Given an N by N matrix of random letters and a dictionary of words, find the maximum number of words that can be found in the matrix.
 *  A word can be considered on the board if: 
 *      1. It can be found on the board.
 *      2. It can be constructed from unused letters by other words.
 *      3. The letters are adjacent, either vertically or horizontally, not diagonally.  
 */

import java.util.*;

public class p341dictionarymatrix {
    public static int maxMatrix(char[][] matrix, String[] dict){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; i < matrix[0].length; j++){
                
            }
        }
        char[][] testMatrix = matrix;
        return 0;
    }
    public static void main(String[] args){
        char[][] charMatrix = {
            {'e', 'a', 'n'},
            {'t', 't', 'i'},
            {'a', 'r', 'a'}
        };
        String[] dict = {"eat", "rain", "in", "rat"};
    }
}
