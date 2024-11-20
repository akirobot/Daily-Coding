/*
 * Given the sequence of keys visited by a postorder traversal of a binary search tree, reconstruct the tree
 * 
 * For example, given the sequence 2, 4, 3, 8, 7, 5, the tree should be:
 * ++++5
 * +++/+\
 * ++3+++7
 * +/+\+++\
 * 2+++4+++8
 */

public class p536postordertravesal {
    class Node {
        int data;
        Node left, right;
        public Node (int data){
            this.data = data;
            left = right = null;
        }
    }
    class BinaryTree{
        public void main (String[] args){
            BinaryTree tree = new BinaryTree();
            int post[] = new int[] {2, 4, 3, 8, 7, 5};
            int n = post.length;
            Node root = 
        }
    }
}
