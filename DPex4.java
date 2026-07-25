//determine no of ways to climb "n" steps of a stair case.you can take 1 and 2 steps only at a time 


import java.util.Scanner;

public class DPex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter position of term required: ");
        int n = sc.nextInt();

        System.out.println(n + "no, of ways to climb : " + CountWays(n));

        sc.close();
    }
    static int CountWays(int n)
{
    if (n<=1) 
        return 1; //so to climb 0 steps there is one way i.e do not climb at all
    int arr_ways[] = new int[n+1]; 
    arr_ways[0]=1;
    arr_ways[1]=1;
    for (int i = 2; i < n; i++) 
        arr_ways[i] = arr_ways[i-1] + arr_ways[i-2];
    return arr_ways[n];
}

}
