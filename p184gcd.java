//Given N numbers, find the greatest common denominator between them.

public class p184gcd {
    //Find the GCD between a and b
    static int gcd(int a, int b){
        //If a is zero, return b
        if (a == 0){
            return b;
        }
        //Otherwise, re-run with remainder of b divided by a and a as the new b
        return gcd(b%a, a);
    }

    static int findGCD(int arr[]){
        //Initialize result to array at 0
        int result = arr[0];
        //For each element in arr
        for (int element: arr){
            //run gcd to find result
            result = gcd(result, element);
            //If at any point, the result is one
            if (result == 1){
                //Stop loop and return 1
                return 1;
            }
        }
        //Otherwise, return result
        return result;
    }
    public static void main (String[] args){
        int arr[] = {42, 56, 14};
        System.out.println(findGCD(arr));
    }
}
