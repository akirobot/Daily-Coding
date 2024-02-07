/*
 * Given an array of integers where every integer occurs three times except for one integer, which only occurs once, find and return the non-duplicated integer.
 * 
 * For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.
 * 
 * Do this in O(N) time and O(1) space. In other words, in a single pass, with only one variable stored.
 */

import java.util.ArrayList;
import java.util.Collections;

public class p549singleoccurence {
    public static ArrayList<Integer> unique(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            arr[i] += 1;
        }
        ArrayList<Integer> res = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++){
            int index = Math.abs(arr[i]) > n ? Math.abs(arr[i]) / (n + 1) : Math.abs(arr[i]);
            if (index == n){
                count++;
                continue;
            }
            int val = arr[index];
            if (val < 0){
                res.add(index - 1);
                arr[index] = Math.abs(arr[index]) * (n + 1);
            }
            else if (val > n){
                continue;
            }
            else{
                arr[index] = -arr[index];
            }
        }
        if (count > 1){
            res.add(n - 1);
        }
        if (res.size() == 0){
            res.add(-1);
        }
        else{
            Collections.sort(res);
        }
        return res;
    }
    public static void main (String[] args){
        int[] array1 = {13, 19, 13, 13};
        ArrayList<Integer> ans = unique(array1);
        for (Integer i : ans){
            System.out.println(i);
        }
    }
}
