//to detemine nth fibonacci term using bottom to top approach i.e we will start with fibo of 0,then 1,followed by 2,3,4,....,50
import java.util.*;

public class DPex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter position of term required: ");
        int n = sc.nextInt();

        long fibo_term = fibo(n);

        System.out.println(n + "th Fibonacci term is: " + fibo_term);

        sc.close();
    }

    static long fibo(int n) {

        // Base cases
        if (n <= 1)
            return n;

        // Create DP array
        long arr[] = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        // Bottom-up calculation
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
