//determine kth smallest element in given array of inetegers without sorting the array .

// so the solution is using maximum heap concepts
//logic- add 1 by 1 element from array to priority queue as long as size of priority queue<=k
//when the size of priority queue exceeed k , remove the root and again continue to add.after all elements of array are added to priority queue,
//peek to get kth smallest elememt.
//eg: i.p {12,0,-67,100,244,17,90,28}, k=1 o.p = -67


import java.util.*;
class queue3 {
    public static void main(String[] args) {
        int nos[] = {12,0,-67,100,244,17,90,28};
        System.out.println("given nos: "+Arrays.toString(nos));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for k i.e to get kth smallest element: ");
        int k = sc.nextInt();
        System.out.println(k+"th smallest element in nos[] is: "+getKthLargestElement(nos,k));
        sc.close();
    }
    static int getKthLargestElement(int nos[] ,int k )
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //for smallest no
        //iterate in nos[] and add 1 by 1 element in pq 
        for(int no : nos)
        {
            pq.offer(no);
            if (pq.size()>k) 
                pq.poll();
        }
        return pq.peek();
    }
}
