//given ll of names. find position of middle node
//note that if we use predefined linkedlist class,then this assignment can be done easily bcz size() will return no of node in ll & this no/2 will give the 
//position of middle node & usingg get() print value in middle node.
//so we will use technique from prog4

public class LL4 {

// Node class stores one name and a reference to the next node
   
    static class Node {
        String name;
        Node next;

        // Constructor to initialize the node with a name
        Node(String name) {
            this.name = name;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Creating linked list:
        // sunil -> ajay -> priti -> nadeem -> manish
        Node head = new Node("sunil");
        head.next = new Node("ajay");
        head.next.next = new Node("priti");
        head.next.next.next = new Node("nadeem");
        head.next.next.next.next = new Node("manish");
        //head.next.next.next.next.next=new Node("Deep");
       // Calling method to find the middle node
        Node middle = getMiddleNode(head);

        // Printing the name stored in middle node
        System.out.println("Value at middle node is: " + middle.name);
    }
  
    static Node getMiddleNode(Node head)
    {
        //here we will use slow fast algorithm also known as hare tortoise algorithm. 
        //slow and fast pointer are initially positioned on head node.slow will move ahead by single position 
        //& fast will move by 2 position. the algorithm says that when fast reaches end of ll,slow is exactly at the center og ll

         // slow pointer moves one node at a time
        Node slow = head;

        // fast pointer moves two nodes at a time
        Node fast = head;

        // When fast reaches the end, slow will be at middle node
        while (fast != null && fast.next != null) {
            slow = slow.next;       // move slow by one node
            fast = fast.next.next;  // move fast by two nodes
        }

        // Return middle node
        return slow;
    }
}
