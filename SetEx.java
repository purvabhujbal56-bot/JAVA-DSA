//Remove duplicate element from given array of integers

import java.util.*; //hashset does't  gyarantee the order of elelemts where as linkedhashset store elements in same order as ther are added.
                    //tree set will store elements in asc order

public class SetEx {
    public static void main(String[] args) {
        int nos[] = {9,11,-62,0,11,9,0,15,78,31,-23,11,15,29};
        System.out.println("Initially , nos[] contains :"+Arrays.toString(nos));
        nos = removeDuplicates(nos); //note that it should not be void method bcz after deleteing the elements,the new array formed will shrink in size
        System.out.println("After removing duplicate ,nos[] contains : "+Arrays.toString(nos));
    }
    static int[] removeDuplicates(int nos[]){
        //logic : add 1 by 1 elements from array to linkedHashset
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        //use for each loop insted of index loop 
        for (int no : nos)             //read only loop
            lhs.add(no);          ///auto boxing where int is converted to integer object
        //now lhs contains unique elements of nos[] but we need unique elements in array
        int result[] = new int[lhs.size()];
        //now copy 1 by 1 element from lhs into result[]
        int i = 0;
        for(int no : lhs)   //autoboxing wherein integer object is converted to int typre
            result[i++] = no ;
        return result;
    }
}
