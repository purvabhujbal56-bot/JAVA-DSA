//given LL of integers and a no. rotate the given LL by given no. to right
//eg i.p LL=10..>20..>30..>40..>50,no = 2 o.p 30..>40..>50..>10..>20
//eg no= 6, o.pn 20..>30..>40..>50..>10

import java.util.Scanner;
import java.util.LinkedList;
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.add(70);
        System.out.println("Given LL conatins :"+ll);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr no for rotating the LL :  ");
        int no = sc.nextInt();
        ll = rotateLL(ll,no);
        System.out.println("after  rotation , LL conatins" +ll);
        sc.close();
    }
    static LinkedList<Integer> rotateLL(LinkedList<Integer>ll,int no)
    {
        //to determine the min no of required rotations
        no = no%ll.size();
        System.out.println("Min no of rotation are"+no);
        for(int i=0;i<no;i++)
        {
            ll.addLast(ll.getFirst());
            ll.removeFirst();
        }
        return ll;
    }
}
