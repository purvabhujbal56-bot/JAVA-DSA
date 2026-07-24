//determine kth largest element in given array of inetegers without sorting the array .
// so the solution is using minimum heap concepts
//logic- add 1 by 1 element from array to priority queue as long as size of priority queue<=k
//when the size of priority queue exceeed k , remove the root and again continue to add.after all elements of array are added to priority queue,
//peek to get kth largest elememt.
//eg: i.p {12,0,-67,100,244,17,90,28}, k=3 o.p = 90
/*process ,pq contains  t()=K(log n)
1.12
2.0,12
3.-667,0,12
4. -67,0,12,100   size>k remove root i.e -67
0,12,100
0,12,100,244  size>k remove root i.e 0
12,100,244
12,17,100,244    size>k remove root i.e 12
17,100,244 
17,90,100,244      size>k remove root i.e 17
90,100,244 
28,90,100,244      size>k remove root i.e 28
90,100,244   peek to get 90  */

import java.util.*;
class Queue2 {
    public static void main(String[] args) {
        int nos[] = {12,0,-67,100,244,17,90,28};
        System.out.println("given nos: "+Arrays.toString(nos));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for k i.e to get kth largest element: ");
        int k = sc.nextInt();
        System.out.println(k+"th largest element in nos[] is: "+getKthLargestElement(nos,k));
        sc.close();
    }
    static int getKthLargestElement(int nos[] ,int k )
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
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
