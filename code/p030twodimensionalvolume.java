/*
 * Given an array of non-negative integers that represents a two-dimensional elevation map where each element is a unit-width wall and the integer is the height. Suppose it will rain and all spots between two walls get filled up.
 * Compute how many units of water remain trapped on the map in O(N) time and O(1) space.
 * For example, given the input [2, 1, 2], we can hold 1 unit of water in the middle.
 * Given the input [3, 0, 1, 3, 0, 5], we can hold three units in the first index, two in the second, and three in the fourth, so eight total.
 * 
 *           []
 *           []
 * []~~~~[]~~[]
 * []    []  []
 * []  [][]  []
 * ------------
 * 
 * 
 * []
 * []~~~~[]~~[]
 * []    []  []
 * []  [][]  []
 * ------------
 * 
 *  Iterate through the input, take the first element as the starting elevation.
 *  Subtract each elevation that is less than the first element to get the volume.
 *  If the next element is greater than or equal to the previous greatest, replace it and continue.
 */

import java.util.*;

public class p030twodimensionalvolume {

    
}
