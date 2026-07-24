/*//To prove that queue is an interface and not a container class

import java.util.*;

class QueueEx {
    public static void main(String[] args) {
       // Queue<Integer> q1 = new Queue<>() ; //error,queue is abstract .cannot instantantiate
        //Queue<Integer> q2 = new ArrayList<>() ; //error,queue canot be implemented using ArrayList as deletion operation is costly
        Queue<Integer> q3 = new LinkedList<>();  //ok t()=O(1)
    }
}*/

//To simulate a tickeeting window where customers are served on first come first serve basis

import java.util.*;
/**
 * QueueEx
 */
public class QueueEx {

    public static void main(String[] args) {
        Queue<String> tq = new LinkedList<>();
        tq.offer("vinay");
        tq.offer("farhan");
        tq.offer("amita");
        tq.offer("manisha");
        tq.offer("Joseph");

        System.out.println("persons standing in queue are : "+tq);
        System.out.println("No. of persons in queue :"+tq.size());

        //Issue ticket for each person 
        while (!tq.isEmpty()) {
            System.out.println("person :"+tq.peek()+"is being issued the ticket");
            tq.poll(); //person leave the queue
            System.out.println("persons in queue are: "+tq);
        }
        System.out.println("No. of person in queue are: "+tq.size());
    }
}
