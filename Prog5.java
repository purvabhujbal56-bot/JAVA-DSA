//eg: i.p nos[]: {2,5,0,9,7,8,6}, target =14,o.p true
//target=25, o.p false
//constraint 2<=n<=10^6
//Approach 1, using Brute force i.e picking up one by one element & adding it to element ahead of it.
//Here T()=O(n^2)which is obviously not acceptable

//to print all pair of elements where sum=target

import java.util.*;  // to accept target value using scanner

public class Prog5 {
    public static void main(String[] args) {
        int nos[] = {2,5,0,9,7,8,6};
        System.out.println("Given nos[] contains" +Arrays.toString(nos));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr target value :");
        int target = sc.nextInt();
        System.out.println("Is sum of any 2 distinct elements from nos[] equals to target?" + isSumTarget(nos,target));
        sc.close();
    }
    static boolean isSumTarget(int nos[], int target)
    {
    boolean found = false;  //till now pais not found

    for(int i = 0; i < nos.length - 1; i++)
    {
        for(int j = i + 1; j < nos.length; j++)
        {
            if(nos[i] + nos[j] == target)
            {
                System.out.println("Pair found {" + nos[i] + "," + nos[j] + "}");
                found = true;
            }
        }
    }

    if(!found)
        System.out.println("Pair not found");

    return found;
    }

}
