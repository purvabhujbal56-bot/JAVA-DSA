//given array of integers. determine the length of longest consecutie sequence
//i.p {38,12,10,37,20,36,40,35,39,11} o.p 6
//imp for interview

import java.util.*;

class Set3 {

    public static void main(String[] args) {

        int[] nos = {38, 12, 10, 37, 20, 36, 40, 35, 39, 11};
        System.out.println("given array nos[] contains: " +Arrays.toString(nos));
        System.out.println("Length of longest consecutive sequence is: " +getlongestConsecutiveSequence(nos));
    }

    // Method to find length of longest consecutive sequence
    static int getlongestConsecutiveSequence(int nos[]) {

        //step-1 create hashset and add all elements of nos[]  into it.
        //adv are 1. will get rid of duplicate 2. searching in array is O(n) whereas in hashset it is O(1)

        HashSet<Integer> hs = new HashSet<>();
        for(int no : nos)
            hs.add(no);
        //step-2 iterate in hashset and look for predecessor of element.if predecessor exists,it means the no is not start of sequence & simply ignore it
        int max_count=0;
        for (int no : hs) {
            if (!hs.contains(no-1)) //no predecessor for no
            {
                int count =1; //start of sequence
                //look for successor
                int next = no+1;
                while (hs.contains(next))   //found successor
                {
                    count++;
                    next = next +1; //look for successor's successor
                }
                if (max_count<count) 
                    max_count=count;
            }
        }
        return max_count;
    }
}
