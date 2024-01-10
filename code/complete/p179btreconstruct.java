package complete;
/*
 * Given the sequence of keys visited by a postorder traversal of a binary search tree, reconstruct the tree.
 */

//Creating Node class, stores value, left and right children
class Node{
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value = value;
        right = null;
        left =  null;
    }
}

//Creating Binary Tree class
class BinaryTree{
    Node root;
    //Add based on value according to standard binary tree structure
    private Node addRecursive(Node current, int value){
        //If the current node is null, create a new one with the given value
        if (current == null){
            return new Node(value);
        }
        //If the value of the current node is greater than the new value, move left
        if (value < current.value){
            current.left = addRecursive(current.left, value);
        } 
        //If the value of the current node is less than the new value, move right
        else if(value > current.value){
            current.right = addRecursive(current.right, value);
        }
        //If at the last node, return it
        else {
            return current;
        }
        //Safety return for edge cases
        return current;
    }
    //
    public void add(int value){
        //Make the root temporarily the new value
        root = addRecursive(root, value);
    }
    public static BinaryTree createBinaryTree(int[] bT2){
        //Create new binary tree
        BinaryTree bt = new BinaryTree();
        //Iterate through array and add elements to binary tree
        for (int i = 0; i < bT2.length; i++){
            bt.add(bT2[i]);
        }
        //Return created binary tree
        //Will need to create a method to display binary tree, but beyond the scope of this problem
        return bt;
    }
    
}

public class p179btreconstruct {
    public static void main(String[] args){
        int[] bT = {2, 4, 3, 8, 7, 5};
        BinaryTree.createBinaryTree(bT);
    }
}



