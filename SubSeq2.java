//print all subsequence of given string "abc"
//a b c ab ba ac abc

public class SubSeq2 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println("Given String s is : "+s);
        printSS(s,0,""); // argument to this recurvie method are 1.given String 2. String index 3. Subsequence formed 
    }
    static void printSS(String s,int index,String ss)
    {
        //base case - when to stop recursion
        if(index == s.length()){
            System.out.println(ss+"");
            return;
        }
        //exclude char at current index
        printSS(s, index+1, ss); // refer to char at next index and do not consider the char for ss

        //include char at current index
        printSS(s, index+1, ss+s.charAt(index)); //concatenate char at current index to ss
    }
}
