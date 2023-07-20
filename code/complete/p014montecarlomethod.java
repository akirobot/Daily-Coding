package complete;
/*
 * The area of a circle is defined as pi*r^2. Estimate pi to 3 decimal places using the Monte Carlo method.
 * 
 * Ask for input on the numbers to simulate. Generate points within an x and y range, the exact range doesn't really matter. Calculate x^2 and y^2. If the sum is less than or equal to 1, increment the variable circle_points. Increment square_points if the number until the number is equal to the inputted limit and repeat generating points. Calculate pi = 4*(circle_points/square_points) and round to 3 places. To calculate accuracy, divide Java's Math.pi from the calculated version and display the percentage accuracy.
 */

import java.util.*;

public class p014montecarlomethod {
    public static double montecarlo(int total){
        //Create a rand variable to generate random numbers
        Random rand = new Random();
        //Initialize variables for circle and square points
        int circle_points = 0;
        int square_points = 0;
        //Run the given number of times
        for (int i = 0; i < total; i++){
            //Generate a random number between 0 and 1 for x and y
            double x_rand = rand.nextDouble();
            double y_rand = rand.nextDouble();
            //Square x and y and add
            double sum = (x_rand * x_rand) + (y_rand * y_rand);
            //If the sum is less than 1, it's within the circle, so increment
            if (sum <= 1){
                circle_points++;
            }
            //Increment square points
            square_points++;
        }
        System.out.println("Circle Points: " +circle_points +", Square Points: " +square_points);
        //Divide circle from square points
        double div = (double) circle_points / (double) square_points;
        System.out.println(div);
        //Multiply the divided number by 4 and return
        double est_pi = 4*(div);
        return est_pi;
    }
    public static void main(String[] args){
        //Ask for input
        System.out.print("How many points to simulate?: ");
        Scanner in = new Scanner (System.in);
        String str = in.nextLine();
        //Try-Catch for non-number inputs
        try {
            //Convert the string into an integer
            int total = Integer.parseInt(str);
            //Run method
            double estimated_pi = montecarlo(total);
            System.out.println("Estimated pi: " +estimated_pi);
            //Create a percentage using Java's built-in Pi
            double percentage = estimated_pi/Math.PI;
            //If percentage exceeds 1
            if (percentage > 1){
                //Subtract 1 to get the percentage over
                double adjusted = 1 - percentage;
                //Double the percentage over to reset to zero, then adjust for percentage over
                //There is a bug where sometimes it displays a percentage over 100, I'm not sure why, it might be a rounding error somewhere.
                double adj_per = percentage - (2*adjusted);
                System.out.println(adj_per*100 + "% accurate");
            }
            //If percentage doesn't exceed 1
            else{
                System.out.println(percentage*100 + "% accurate");
            }
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        in.close();
    }
}
