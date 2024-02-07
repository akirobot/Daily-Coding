package complete;
/*
 * Assume you have access to a function toss_biased() which returns 0 or 1 with a probability that's not 50-50 (but also not 0-100 or 100-0). You do not know the bias of the coin.
 * 
 * Write a function to simulate an unbiased coin toss.
 * 
 * This problem is written strangely. I think it is asking to have you write a function that randomizes the bias between executions, excluding 100% for heads or tails or a pure 50-50.
 */

public class p551biasedcoin {
    public static boolean toss_biased(){
        //Since we want to avoid 100-0 or 0-100, we define the max and min as 1 below and above respectively.
        int max = 99;
        int min = 1;
        //Generate a value for heads. We only need a heads, since we're looking for a value that our random number needs to be above.
        int heads = (int) ((Math.random()*(max-min))+min);
        //If the generated number is 50, keep generating until 50 is no longer heads.
        while (heads == 50){
            heads = (int) ((Math.random()*(max-min))+min);
        }
        //Print out the real probability.
        System.out.println(heads +"-" +(100-heads));
        //If our second random number is greater than heads, then heads wins, otherwise, tails wins.
        if ((int) ((Math.random()*(max-min))+min) > heads) {
            return true;
        }
        return false;
    }
    public static void main (String[] args){
        if(toss_biased()){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
    }
}
