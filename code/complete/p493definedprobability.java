package complete;
/*
 * You are given n numbers as well as n probabilities that sum up to 1. Write a function that generate one of the numbers with its corresponding probability.
 * 
 * For example, given the numbers [1, 2, 3, 4] and probabilities [0.1, 0.5, 0.2, 0.2], your function should return 1 10% of the time, 2 50% of the time, and 3 and 4 20% of the time.
 */

import java.util.*;

public class p493definedprobability {
    //Pre-defining lists for numbers and their associated percentages
    static List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    static List<Double> percentage = Arrays.asList(0.1, 0.5, 0.2, 0.2);
    //Method for determining probability.
    public static Integer probability(){
        //Creating a tree map to link the numbers and percentages
        TreeMap<Double, Integer> map = new TreeMap<>();
        //Double to determine where the generated random double falls between
        double total = 0.0d;
        //For loop to populate tree and link their percentages.
        for (int i = 0; i < numbers.size(); i++){
            map.put(total += percentage.get(i), numbers.get(i));
        }
        //Creating a number generator
        Random generator = new Random();
        //Tell the generator to generate a double, which falls between 0 and 1
        double value = generator.nextDouble();
        //From the tree map, return the number that the generated double falls between
        return map.ceilingEntry(value).getValue();
    }
    public static void cycle(int cycles){
        //Create an array to store total appearances of each number
        int arrays[] = new int[numbers.size()];
        //For loop to run a certain number of cycles
        for (int i = 0; i < cycles; i++){
            //Given the result of probability, which returns an integer, subtract one to get the index of the corresponding part in the counting array
            arrays[probability()-1]++;
        }
        //Print the result
        System.out.println("Of 100000 cycles:");
        for (int j = 0; j < arrays.length; j++){
            double percent = arrays[j];
            System.out.print(j+1 +" appeared " +arrays[j] +" times (");
            //Format the double to round to 3 digits
            System.out.printf("%.3f", (percent/100000)*100);
            System.out.print("%)");
            System.out.println();
        }
    }

    public static void main(String[] args){
        cycle(100000);
    }
}
