//to determine nth fibonacci term where n is accepted from user 
//it take time to execute 50 th 
import java.util.*;

public class DPex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position of term(base 0) : ");
        int n = sc.nextInt();
        long fibo_term = fibo(n);
        System.out.println(n+"th fibo term is : "+fibo_term);
        sc.close();
    }
    static long fibo(int n){
        //base case - when to terminate recursive
        if(n<=1)
            return n; //fibo(0) is 0,fibo(1) is 1

        long fibo_term = fibo(n-1)+fibo(n-2);   //recursive call
        return fibo_term;
    }
}
