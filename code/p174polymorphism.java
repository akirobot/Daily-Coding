/*
 * Describe and give an example of each of the following types of polymorphism: ad-hoc, parametric, subtype.
 */

public class p174polymorphism {
    public static void subtype(){
        //Uses a class to reference multiple subtypes at once. Each subtype might be similar with each other, but effectively separate objects.
    }

    //One type can interact with multiple types.
    public static void parametric(){

    }

    //Similarly named functions act differently for different types. Each must be explicitly stated.
    public static int adHoc(int a, int b){
        return a + b;
    }
    public static String adHoc(String a, String b){
        return a + b;
    }

    public static void main (String[] args){

    }
}
