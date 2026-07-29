//given a binary tree with nodes containing an int value and also a target value .
// determine whether sum of all nodes in any path is target or not 
//logic: this problen has to be solved using 2 stacks only. 1 stack will store addresses of nodes and 
// another running total from root node to parent node.
//without addresses ,we will not be able to traverse the tree .
//  check the running total with target value when you reach leaf node only

import java.util.*;

class Nodeex{
    int data;
    Nodeex left, right;

    Nodeex(int no) {
       data = no;
        left = right = null;
    }
}

public class Treeex1 {

    public static void main(String[] args) {

        // Creating Binary Tree
       
        Nodeex root = new Nodeex(6);
       
        root.left = new Nodeex(7);
        root.right = new Nodeex(9);
        root.left.left = new Nodeex(3);
        root.left.left.left = new Nodeex(2);
        root.left.right = new Nodeex(4);
        root.right.left = new Nodeex(8);
        root.right.right = new Nodeex(1);
        root.right.right.left = new Nodeex(5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target value :");

        int target = sc.nextInt();
        System.out.println("Is sum all nodes along path from root to leaf node equal to target? "+isSumTarget(root,target)); 
    }
    // Method to check whether a path with given sum exists
    static boolean isSumTarget(Nodeex root, int target) {

        Stack<Nodeex> stk_adr = new Stack<>();
        Stack<Integer> stk_val = new Stack<>();

        //push the root and its value in stack
        stk_adr.push(root);
        stk_val.push(root.data);
        while (!stk_adr.isEmpty()) //any stack will do bcoz operation will be parallel in both stacks
        {
            Nodeex temp = stk_adr.pop();
            int sum = stk_val.pop();
            //check whether it is a leaf node. if true ,check whether the sum == target
            if(temp.left ==null && temp.right==null&& sum==target)
                return true;
            //if it is not leaf node,push its left & right child in stack
            if (temp.left!=null) {
                stk_adr.push(temp.left);
                stk_val.push(sum+temp.left.data);
            }
            if(temp.right!=null)
            {
                stk_adr.push(temp.right);
                stk_val.push(sum+temp.right.data);
            }
        }
        //return false;
        return false;
    }
}