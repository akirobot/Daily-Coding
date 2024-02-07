package complete;
/*
 * Given an N by M matrix of numbers, print out the matrix in a clockwise spiral.
 */

import java.util.*;

public class p525spiralmatrix {
    public static void generateMatrix (int x, int y){
        int[][] matrix = new int[x][y];
        int number = 1;
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                matrix[i][j] = number;
                System.out.print(number +"\t");
                number++;
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        spiralPrintMatrix(matrix);
    }
    public static void spiralPrintMatrix (int[][] matrix){
        int columns = matrix.length - 1;
        int rows = matrix[0].length - 1;
        int xStart = 0;
        int yStart = 0;
        //There is a bug if x and y are not the same value
        //This feels like an inelegant solution using try-catch
        try{
            do{
                for (int i = xStart; i <= columns; i++){
                    System.out.print(matrix[xStart][i] +" ");
                }
                yStart++;
                for (int j = yStart; j <= rows; j++){
                    System.out.print(matrix[j][columns] +" ");
                }
                columns--;
                for (int k = columns; k >= xStart; k--){
                    System.out.print(matrix[rows][k] +" ");
                }
                rows--;
                for (int l = rows; l >= yStart; l--){
                    System.out.print(matrix[l][yStart-1] +" ");
                }
                xStart++;
            } while (xStart <= columns && yStart <= columns); 
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println("dumb");
        }
    }
    public static void main (String[] args){
        //Create scanner for input
        Scanner in = new Scanner (System.in);
        try{
            //Ask for x and y inputs
            System.out.print("Enter X: ");
            String str = in.nextLine();
            int x = Integer.parseInt(str);

            System.out.print("Enter Y: ");
            str = in.nextLine();
            int y = Integer.parseInt(str);
            
            System.out.print("\n");
            generateMatrix(x, y);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        in.close();
    }
}
