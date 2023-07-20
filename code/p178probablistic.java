package complete;
/*
 * Roll a dice repeatedly. For the first game, stop when you get a five followed by a six. The number of rolls is the dollars you pay. For the second, stop when you get two fives. Which one is preferable to lose the least?
 */

import java.util.concurrent.ThreadLocalRandom;

public class p178probablistic {
    //Generic method for rolling, allows selection of two numbers in sequence, and different dices
    public static int numThenNum(int first, int second, int min, int max){
        //Initialize total rolls
        int totalRolls = 0;
        //Initialize previous roll
        int prev = 0;
        //Iterate until condition is met
        for (int i = 0; i < 1000000; i++){
            //Roll dice
            int roll = ThreadLocalRandom.current().nextInt(min, max+1);
            //Increment count
            totalRolls++;
            //If the previous roll is equal to the first number, and the current is equal to the second, break out
            if (prev == first && roll == second){
                break;
            }
            //Otherwise, set previous roll to current, move to next
            else{
                prev = roll;
            }
        }
        //Return total rolls
        return totalRolls;
    }
    public static void averageOfNThenN(){
        //Set count for total number of games, larger is better
        int count = 10000;
        //Initialize total for fiveSix to create average
        int fiveSixAvg = 0;
        //Play 'count' games
        for (int j = 0; j < count; j++){
            //Add rolls to total
            fiveSixAvg = fiveSixAvg + numThenNum(5, 6, 1, 6);
        }
        //Find average
        System.out.println(fiveSixAvg/count);
        //Initialize total for fiveFive to create average
        int fiveFiveAvg = 0;
        //Play 'count' games
        for (int k = 0; k < count; k++){
            //Add rolls to total
            fiveFiveAvg = fiveFiveAvg + numThenNum(5, 5, 1, 6);
        }
        //Find average
        System.out.println(fiveFiveAvg/count);
    }
    public static void main(String[] args){
        averageOfNThenN();
    }
}
/*
 * In a perfectly random system, the two should be even, however I think the slight difference comes from the method of randomization.
 */
