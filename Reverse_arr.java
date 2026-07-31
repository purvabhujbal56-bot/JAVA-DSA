// Write a method to reverse contents of array
// Input : {10,8,0,-6,14}
// Output: {14,-6,0,8,10}

import java.util.Arrays;

class Reverse_arr {
    public static void main(String args[]) {
        int nos[] = {10, 8, 0, -6, 14};

        System.out.println("Given nos[] is: " + Arrays.toString(nos));

        int result[] = getReverseNos(nos);

        System.out.println("Reversed array is: " + Arrays.toString(result));
    }
    static int[] getReverseNos(int nos[]) {
        int j = nos.length - 1;
        int temp;

        for (int i = 0; i < j; i++, j--) {
            temp = nos[i];
            nos[i] = nos[j];
            nos[j] = temp;
        }
        //return nos;
        return nos;
    }
}