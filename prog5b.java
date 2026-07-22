//eg: i.p nos[]: {2,5,0,9,7,8,6}, target =14,o.p true
//target=25, o.p false
//constraint 2<=n<=10^6

//approach 3,using 2 hashset.here as we iterate/traverse in the array only once, T()=O(n) which is better than O(n log n)
import java.util.*;  // to accept target value using scanner

public class prog5b {
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
        HashSet<Integer> hs = new HashSet<>(); //<> is called as diamond operator
        //hashSet is a class in Collections framework which supports generics.Generics is a feature in java which will work on all type of data.
        //however generics supports objects types only and not pdts i.e prmitive datatype .
        //the main benefit of hashing is that the retrival rate of data is  O(1).

        //iterate in array and check whether the hash set contains the complement / better half of that no.

        for(int i=0;i<nos.length;i++)
        {
            int complement = target-nos[i];
            if (hs.contains(complement)) //conatins is a boolean method for searching data
            {
                System.out.println("pair found {"+complement+","+nos[i]+"}");
                return true;
            }
            hs.add(nos[i]);
        }
        System.out.println("pair not found");
        return false;
    }
}

