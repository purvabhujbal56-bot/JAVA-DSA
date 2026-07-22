//write a method to determine whether 1 string s a subsequence of another string or not
// a subsequence is a part of given string with 1 or more (can be none also) missing characters of original string but relative order ofcharaters same.
//eg if given string is "abcdef", subsequence can be "ace "but not "aec" substring is a continuous portion of given string.
//this  means all substring can also become subsequence but reverse is not true

public class StringEx {
    public static void main(String[] args) {
        String s = "abcdef" , t="ace";
        System.out.println("Given string s is :"+s);
        System.out.println("Given string s is :"+t);
        System.out.println("Is t a subsequence of s?"+ isSubSequence(s,t));
    }
    static boolean isSubSequence(String s, String t)
    {
        //use 2 pointer where i to refer to string s and j to refer to string t
        int i=0,j=0;//position vars i and j at the start of s & t
        //comparison will continue till end of both string is not reached
        while (i<s.length()&& j<t.length()) {
            if (s.charAt(i)==t.charAt(j)) 
                j++;
            i++;
        } 
        if (j==t.length()) //all char in string t are checked 
            return true;
        return false;
        //return j==t.length();
    }
}
