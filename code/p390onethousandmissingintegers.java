import java.util.*;
//Given an unsorted list of 999,000 unique integers, from 1 to 1,000,000, find the missing 1000 numbers. What is the computational and space complexity of your solution?

public class p390onethousandmissingintegers {
    public static void findThousand(List<Integer> a){
        Collections.sort(a); //O(n*log(n))
        for (int i = 0; i < a.size(); i++){
            int temp = 1;
            if (a.get(i) != temp){
                System.out.println(temp);
            }
            temp++;
        }
        System.out.print("RUN");
    }
    public static void main (String[] args){
        List<Integer> a = new ArrayList<>(999000);
        for (int i = 1; i <= 1000000; i++){
            a.add(i);
        } 
        Collections.shuffle(a);
        findThousand(a);
    }
}