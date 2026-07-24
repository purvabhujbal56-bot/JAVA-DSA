//given an array of integers and target value . determine whether sum of any 2 distinct elements is equal to target or not and if true, return indices of these elements otherwise return{-1,-1}
//eg i.p 2,3,0,6,9,5,7 target=10 o.p 1,6 if target= 25 o.p -1,-1
//logic - Here we will store the value of element as key in HashMap whereas we will put the index as value.

import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        int nos[]={2,3,0,6,9,5,7};
        System.out.println("given nos: "+Arrays.toString(nos));
        Scanner sc = new Scanner(System.in);
        System.out.println("enter target value : ");
        int target = sc.nextInt();
        int result[]=getPairs(nos,target);
        System.out.println("{"+result[0]+","+result[1]+"}");
        sc.close();
    }
    static int[] getPairs(int nos[],int target)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        //iterate in array & determine whether complement of element is available
        for (int i = 0; i < nos.length; i++) {
            int complement = target-nos[i];
            if (hm.containsKey(complement)) {
                int i1 = hm.get(complement);
                return new int[] {i1,i};
            }
            hm.put(nos[i], i); //element as key ,index as value 
        }
        return new int[]{-1,-1};
    }
}
