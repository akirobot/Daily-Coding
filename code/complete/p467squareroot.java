package complete;
/*
 * Given a real number n, find the square root of n.
 * 
 * This is easy in java since it has a built in square root function.
 */

public class p467squareroot {
    public static double squareroot(double number){
        return Math.sqrt(number);
    }
    public static void main (String[] args){
        System.out.println(squareroot(7));
    }
}
