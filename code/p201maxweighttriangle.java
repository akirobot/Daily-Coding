/*
 * Given an array of an array of integers, where each array corresponds to a row in a triangle of numbers, write a program that returns the maximum weight path.
 * 
 * You can "traverse" the triangle by taking your current index, then either keeping it on the next row, or adding one. Which ever one is higher determines the higher of the two. Since we are simulating a triangle, there are only two options for "adjacent" numbers.
 * 
 * This method does not check deeper than the next layer, leading to a potential situation where another path would have a higher weight, but not made immediately obvious. To account for this, you would need to check each potential path individually, since it would not be enough to check just another layer below, or even several . 
 */

public class p201maxweighttriangle {
    public static void maxweight(int[][] triangle){
        int totalWeight = 0;
        for (int i = 0; i < triangle.length; i++){
            int higher = 0;
            int position = 0;
            if (higher < triangle[i][position]){
                higher = triangle[i][position];
            }
            totalWeight = totalWeight + higher;
        }
    }
    public static void main(String[] args){
        int[][] triangle = {{1}, {2, 3}, {1, 5, 1}}; 
        maxweight(triangle);
    }
}
