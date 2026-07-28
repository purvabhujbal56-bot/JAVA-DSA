//without using any data structure

import java.util.*;

public class DPex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter position of term required: ");
        int n = sc.nextInt();

        long fibo_term = fibo(n);

        System.out.println(n + "th Fibonacci term is: " + fibo_term);

        sc.close();
    }

    static long fibo(int n) {

        if (n <= 1)
            return n;
//logic of fibonacci serise

        long first = 0;
        long second = 1;
        long next = 0;

        for (int i = 2; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }

        //return second;
        return second;
    }
}