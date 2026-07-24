//to determine nth fibo term using memoisation (top to bottom approach)

import java.util.*;

public class DPex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position of term(base 0) : ");
        int n = sc.nextInt();
        //declare an array of size n+1
        long memo[] = new long[n+1];
        //fill the array with -1 becz -1 is not a fibo term
        Arrays.fill(memo, -1);
        long fibo_term = fibo(n,memo);
        System.out.println(n+"th fibo term is : "+fibo_term);
        sc.close();
    }
    static long fibo(int n, long memo[]){
        //base case - whento terminate recursive
        if(n<=1)
        {
            memo[n]=n;
            return n; //return memo[n] is also ok
        }
        //imp step,if result are available in memo[],avoid recursion
        if(memo[n]!= -1)
            return memo[n];
        long fibo_term = fibo(n-1, memo)+ fibo(n-2, memo);
        memo[n] = fibo_term;
        return fibo_term; //return memo[n] is also ok
    }
}
