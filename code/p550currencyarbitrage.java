/*
 * Suppose you are given a table of currency exchange rates, represented as a 2D array. Determine whether there is a possible arbitrage; that is, whether there is some sequence of trades you can make, starting with some amount A of any currency, so that you can end up with some amount greater than A of that currency.
 * 
 * There are no transaction costs and you can trade fractional quantities.
 * 
 *     A     B     C     D     E
 * A 0.000 1.001 0.980 0.987 0.997
 * B 1.002 0.000 1.003 1.009 0.780
 * C 0.972 1.005 0.000 0.956 0.841
 * D 0.985 0.965 0.884 0.000 0.926
 * E 0.991 0.870 1.010 1.009 0.000
 * 
 * It would be best to keep the value and quantity of currency as separate values.
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class p550currencyarbitrage {
    public static void generateMatrix (int currencies, int max, int min){
        double[][] matrix = new double[currencies][currencies];
        Random r = new Random();
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        for (int i = 0; i < currencies; i++){
            for (int j = 0; j < currencies; j++){
                if (i == j){
                    matrix[i][j] = 0.000;
                }
                else {
                    matrix[i][j] = ((min + (max - min) * r.nextDouble())/1000);
                }
                System.out.print(df.format(matrix[i][j]) +"\t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public static void main (String[] args){
        generateMatrix(6, 1020, 800);
    }
}
