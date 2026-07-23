// given ll of integers. create a new ll using node of previous ll by first adding nodes at even position folloewed bye odd position
//i.p ll = 8>-4>16>15>10>21   o.p 8>16>10>-4>15>21
import java.util.LinkedList;

public class LL2 {

    public static void main(String[] args) {

        LinkedList<Integer> ll1 = new LinkedList<>();

        ll1.add(8);
        ll1.add(4);
        ll1.add(16);
        ll1.add(15);
        ll1.add(10);
        ll1.add(21);

        System.out.println("Given LL contains : " + ll1);

        LinkedList<Integer> ll2 = EvenOddLL(ll1);

        System.out.println("After adding nodes, LL contains : " + ll2);
    }

    static LinkedList<Integer> EvenOddLL(LinkedList<Integer> ll) {

        LinkedList<Integer> ll2 = new LinkedList<>();

        // Add elements at even positions (0,2,4,...)
        for (int i = 0; i < ll.size(); i++) {
            if (i % 2 == 0) {
                ll2.add(ll.get(i));
            }
        }

        // Add elements at odd positions (1,3,5,...)
        for (int i = 0; i < ll.size(); i++) {
            if (i % 2 != 0) {
                ll2.add(ll.get(i));
            }
        }

        return ll2;
    }
}