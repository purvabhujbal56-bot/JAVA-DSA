//To prove that priority Queue by default implement minimum heap .In minimum heap,elememt are not ordered in asc order nut if removed,will display the element in asc order
//also note that PriorityQueue is not an interface but a container class and can stare elements

import java.util.*;

public class Queue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(3);
        pq.offer(8);
        pq.offer(2);
        pq.offer(4);
        System.out.println("pq contains :"+pq);
        //start deleting one by one element 
        System.out.println("deleting elements from pq");
        while (!pq.isEmpty()) 
            System.out.print(pq.poll() +" ");//asc order 
    }  
}
