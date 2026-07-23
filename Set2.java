//write a method to remove duplicate names from given linkedlist of names
// i.p ll=triyant>suresh>ajay>suresh>amit>veena o.p ll= triysnt>suresh>ajay>amit >veena

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Set2 {

    public static void main(String[] args) {

        // Creating a linked list of names
        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("Trijayant");
        ll1.add("Suresh");
        ll1.add("Ajay");
        ll1.add("Ajay");
        ll1.add("Suresh");
        ll1.add("Amit");
        ll1.add("Veena");

        System.out.println("Given LL contains: " + ll1);

        // Calling method to remove duplicate names
        LinkedList<String> ll2 = removeDuplicates(ll1);

        System.out.println("After removing duplicates, LL contains: " + ll2);
    }

    // Method removes duplicate names while preserving original order
    static LinkedList<String> removeDuplicates(LinkedList<String> ll1) {
        //to copy all data from 1 collection into another ,there are 2 methods and no need to use loop
        //either use the parameterized constructor with collection reference or use addall()

        LinkedHashSet<String> lhs = new LinkedHashSet<>(ll1);//1.

        /*  LinkedHashSet<String> lhs = new LinkedHashSet<>(); //2.
         lhs.addAll(ll1);*/

        // Convert set back to LinkedList and return it
        return new LinkedList<>(lhs);
    }
}