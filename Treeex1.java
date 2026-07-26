//given a binary tree with nodes obtaining an int value and also a target value .
// determine whether sum of all nodes in any path is target or not 

class Nodeex {
    int data;
    Nodeex left, right;

    Nodeex(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Treeex1 {

    // Method to check whether a path with given sum exists
    static boolean hasPathSum(Nodeex root, int target) {

        // If tree is empty
        if (root == null)
            return false;

        // If current node is a leaf node
        if (root.left == null && root.right == null) {
            return (target == root.data);
        }

        // Reduce target by current node value
        int remaining = target - root.data;

        // Check in left or right subtree
        return hasPathSum(root.left, remaining) ||
               hasPathSum(root.right, remaining);
    }

    public static void main(String[] args) {

        // Creating Binary Tree
        /*
                  10
                 /  \
                8    2
               / \    \
              3   5    2
        */

        Nodeex root = new Nodeex(10);
        root.left = new Nodeex(8);
        root.right = new Nodeex(2);
        root.left.left = new Nodeex(3);
        root.left.right = new Nodeex(5);
        root.right.right = new Nodeex(2);

        //int target = 22;
        int target = 21;

        if (hasPathSum(root, target))
            System.out.println("Path with target sum exists.");
        else
            System.out.println("Path with target sum does not exist.");
    }
}