//eg: i.p nos[]: {2,5,0,9,7,8,6}, target =14,o.p true
//target=25, o.p false
//constraint 2<=n<=10^6
//Approach 1, using Brute force i.e picking up one by one element & adding it to element ahead of it.
//Here T()=O(n^2)which is obviously not acceptable

//approach 2 ,using 2 pointer. but requirement is that the element of array need to be sorted (ASC order).T()=O(n log n).

import java.util.*;  // to accept target value using scanner

public class prog5a {
    public static void main(String[] args) {
        int nos[] = {2,5,0,9,7,8,6};
        System.out.println("Given nos[] contains" +Arrays.toString(nos));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr target value :");
        int target = sc.nextInt();
        System.out.println("Is sum of any 2 distinct elements from nos[] equals to target?" + isSumTarget(nos,target));
    }
    static boolean isSumTarget(int nos[], int target)
    {
        Arrays.sort(nos);   //by default in asc order
        //Arrays.sort(nos,Collections.reverseOrder()); //for that import collections package
        int i =0,j=nos.length-1;
        while (i<j) {
            int sum = nos[i]=nos[j];
            if (sum==target) {
                System.out.println("pair found,{"+nos[i]+","+nos[j]+"}");
                return true;
            }
            if (sum>target)  //try smaller element
                j--;
            else
                i++;     //try larger element
        }
        System.out.println("pair not found");
        return false;
    }
}

