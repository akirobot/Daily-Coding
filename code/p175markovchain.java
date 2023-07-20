package complete;
/*
 * Given a starting state 'start', a list of transition probablities for a Markov chain, and a number of steps 'num_steps', run the Markov chain starting from 'start' for 'num_steps' and compute the number of times each state is visited
 */

import java.util.concurrent.ThreadLocalRandom;

public class p175markovchain {
    public static void mkvChain(String start, int steps){
        //Define relations to other nodes
        int[] a = {900, 75, 25}; //a -> a, a -> b, a -> c
        int[] b = {800, 150, 50}; //b -> b, b -> a, b -> c
        int[] c = {500, 250, 250}; //c -> c, c -> a, c -> b
        //Value to track current step
        int step = 0;
        //Minimum and maximum for random generation
        int min = 1;
        int max = 1000;
        //Count for A, B, and C
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        //Current state
        int[] state = null;
        //Setting switch case based on start variable
        String s = start;
        //If start is a variable, set the state to the same
        if (start == "a"){
            state = a;
        }
        if (start == "b"){
            state = b;
        }
        if (start == "c"){
            state = c;
        }
        //Iterate through until steps limit is reached
        while (step < steps){
            //Generate a random number between the min and max, inclusive
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            //Increment steps taken
            step++;
            //Switch based on what the current node is
            switch (s){
                case "a":
                    if (0 < randomNum && randomNum <= 900){state = a; s = "a"; aCount++; break;}
                    if (900 < randomNum && randomNum <= 975){state = b; s = "b"; bCount++; break;}
                    if (975 < randomNum && randomNum <= 1000){state = c; s = "c"; cCount++; break;}
                case "b":
                    if (0 < randomNum && randomNum <= 900){state = b; s = "b"; bCount++; break;}
                    if (800 < randomNum && randomNum <= 950){state = a; s = "a"; aCount++; break;}
                    if (950 < randomNum && randomNum <= 1000){state = c; s = "c"; cCount++; break;}
                case "c":
                    if (0 < randomNum && randomNum <= 500){state = c; s = "c"; cCount++; break;}
                    if (500 < randomNum && randomNum <= 750){state = a; s = "a"; aCount++; break;}
                    if (750 < randomNum && randomNum <= 1000){state = b; s = "b"; bCount++; break;}
                default:
                    break;
            }
        }
        System.out.println("A: " +aCount);
        System.out.println("B: " +bCount);
        System.out.println("C: " +cCount);
        System.out.println("Total: " +(aCount + bCount + cCount));
    }
    public static void main(String[] args){
        mkvChain("a", 10000);
    }
}
