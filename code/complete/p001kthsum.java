package complete;
/*
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k
 */

import java.util.*;

public class p001kthsum {
    public static boolean listSum(List<Integer> list, int toSum){
        List<Integer> tempList = new ArrayList<Integer>();
        //For each element in list
        for (int i = 0; i < list.size(); i++){
            //If there isn't already an elemeent in tempList
            if (tempList.isEmpty()){
                //Add it
                tempList.add(list.get(i));
                //Reset back to start of for loop
                System.out.println(tempList);
                continue;
            }

            //Compare to element in tempList
            /*for (int j = 0; j < tempList.size(); j++){
                if (list.get(i) + tempList.get(j) == toSum){
                    System.out.println(tempList);
                    return true;
                }
                else{
                    tempList.add(list.get(i));
                    System.out.println(tempList);
                }
            }*/
        }
        //If list is iterated and no sum was found, return false
        return false;
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(15);
        list.add(3);
        list.add(7);
        //System.out.println(list);
        System.out.println(listSum(list, 17));
    }
}
