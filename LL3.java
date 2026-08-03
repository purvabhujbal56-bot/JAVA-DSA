//given 2 ll of integers . determine whether they intersect or not and if they interect,display vlaue at intersecting node 
//i.p l1:  10 20 30 40 50 null   l2: 2 5 null
//o.p given ll do not intersect

/*  here we need to deal with addresess of nodes & built in class linkedlist of util 
package doesnt give access to node address ,we need to define ouw own linkedlist class*/

class Node{
    int data;
    Node next;

    Node(int no) //parameterized constructor
    {
        data = no;
        next=null;
    }
}
public class LL3 {

     public static void main(String[] args) {
        //create ll1
        Node head1= new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next  = new Node(40);
        head1.next.next.next.next= new Node(50);

        //create ll2
        Node head2= new Node(2);
        head2.next = new Node(5);
        //make 40 of ll1 as interecting node
        head2.next.next = head1.next.next.next;    //comment it if you do not want to intersect
        //if we skip above statement ,then we have no intersecting node

        Node intersect = checkIntersection(head1,head2);

        if (intersect == null) 
            System.out.println("given 2 ll do not inetrsect");
        else
            System.out.println("given 2 ll intersect node with value: " +intersect.data);
        
     }
     static Node checkIntersection(Node head1,Node head2){
        Node p1 = head1, p2 = head2;
        //make both p1&p2 traverse ll1 & ll2 and after that ask them to traverse other ll 
        // & stop only when they meet
        while (p1!=p2) {
            if (p1==null) 
                p1 = head2; //move to other ll
            else
                p1 = p1.next; //continue
            if(p2 == null)
                p2 = head1;
            else
                p2 = p2.next;
        } 
       // return  p1;  //return p2 is also ok
        return  p1;  //return p2 is also ok
     }
}

