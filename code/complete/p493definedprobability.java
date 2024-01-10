package complete;
/*
 * You are given n numbers as well as n probabilities that sum up to 1. Write a function that generate one of the numbers with its corresponding probability.
 * 
 * For example, given the numbers [1, 2, 3, 4] and probabilities [0.1, 0.5, 0.2, 0.2], your function should return 1 10% of the time, 2 50% of the time, and 3 and 4 20% of the time.
 */

import java.util.*;

public class p493definedprobability {
    static List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    static List<Double> percentage = Arrays.asList(0.1, 0.5, 0.2, 0.2);
    public static Integer probability(){
        TreeMap<Double, Integer> map = new TreeMap<>();
        double total = 0.0d;
        for (int i = 0; i < numbers.size(); i++){
            map.put(total += percentage.get(i), numbers.get(i));
        }
        Random generator = new Random();
        double value = generator.nextDouble();
        return map.ceilingEntry(value).getValue();
    }
    public static void cycle(int cycles){
        int arrays[] = new int[numbers.size()];
        for (int i = 0; i < cycles; i++){
            arrays[probability()-1]++;
        }
        System.out.println("Of 1000 cycles:");
        for (int j = 0; j < arrays.length; j++){
            double percent = arrays[j];
            System.out.print(j+1 +" appeared " +arrays[j] +" times (");
            System.out.printf("%.3f", (percent/100000)*100);
            System.out.print("%)");
            System.out.println();
        }
    }

    public static void main(String[] args){
        cycle(100000);
    }
}
