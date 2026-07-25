//give BST with int value in its nodes .determine the min difference between any 2 nodes of this BST.
//note that the differnce must be +ve
//logic-1, There is no predefined class in java to create either a tree or gragph.
//they are to be created by defining a class node.
//logic-2 arrange value from node in asc order .this can be achieved using Inorder traversal

import java.util.ArrayList;

class Nodeex {
    int data ;
    Nodeex left,right;
    //parameterized constructor 
    Nodeex(int no)
    {
        data = no;
        left = right = null;
    }
}
public class TreeEx {
    public static void main(String[] args) {
         // Creating BST
        Nodeex root = new Nodeex(20);
        root.left = new Nodeex(10);

        root.left.left = new Nodeex(5);
        root.left.right = new Nodeex(15);
        root.left.right.left = new Nodeex(12);

        root.right = new Nodeex(35);
        root.right.left = new Nodeex(22);
        
        //traversing this bst in inorder and store its result in arraylist
        ArrayList<Integer> al = new ArrayList<>();
        //traversal methods in trees are generally voud and recursive & hence do not return any value 
        //so pass arraylist as reference to inorder()

        inorder(root,al);

        System.out.println("Minimum Difference = " + getMinDiff(al));
    }
    static void  inorder(Nodeex root,ArrayList<Integer> al)
    {
        //base case
        if (root==null) 
            return;
        //travese left
        inorder(root.left, al);
        //visit root means add value of node to arraylist
        al.add(root.data);
        //traverse right
        inorder(root.right, al);
    }
    static int getMinDiff(ArrayList<Integer> al){
        //to fetch data of element use get(int index)

    int getMinDiff = Integer.MAX_VALUE;
    // Compare adjacent elements in the sorted ArrayList
    for (int i = 1; i < al.size(); i++) {

        int diff = al.get(i) - al.get(i - 1);

        if (diff < getMinDiff)
           getMinDiff = diff;
    }
    return getMinDiff;
    }
}
