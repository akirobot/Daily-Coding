package complete;
/*
 *  Suppose you have a multiplication table that is N by N. That is, a 2D array where the value at the i-th row and j-th column is (i+1) * (j+1) (if 0-indexed) or i * j if (1-indexed).
 *  Given integers N and X write a function that returns the number of times X appears as a value in an N by N multiplication table.
 *  For example, given N=6 and X=12, you should return 4 since the multiplication table looks likethis:
 * 
 * | 1| 2| 3| 4| 5| 6|
 * | 2| 4| 6| 8|10|12|
 * | 3| 6| 9|12|15|18|
 * | 4| 8|12|16|20|24|
 * | 5|10|15|20|25|30|
 * | 6|12|18|24|30|36|
 * 
 *  This is actually simpler than it appears. Since we are really looking for divisors of X, we do not need to create and check a table, we only need to find the number of divisors between 1 and N.
 *  The first row and column excluded unless N >= X because if a table was created, X would appear, but otherwise it would not, even though 1 is technically a divisor. If N >= X then add two more to the total since the first column and first row would contain X.
 *  We also need to run a check by squaring N, and seeing if that is greater or less than X. If N greater, then we can run as normal. If X is greater, then return 0 since X would be beyond the bounds of the table.
 */

public class p557twodimensionmulttable {
    public static int multTable(int N, int X){
        //Global total variable to track the total appearances of X
        int total = 0;
        //If N squared is less than X, return 0 since X would fall outside the bounds of the table.
        if (N*N < X){
            return 0;
        }
        //If N is greater than or equal to X, add two to the total since X would appear in the first row and column.
        if (N >= X){
            total = total+2;
        }
        //We can start at 2 because of the previous if-statement which checks the first row and column.
        for(int i=2; i <= N; i++){
            //If i is a divisor of X, then increase the total. We don't need to determine where this occurs, since each row and column are non repeating within themselves.
            if(X%i == 0){
                total++;
            }
        }
        return total;
    }
    public static void main(String[] args){
        int N = 100;
        int X = 24;
        System.out.println(X +" appears " +multTable(N, X) +" times in a " +N +" by " +N +" multiplication table.");
    }
}
