//accept words from user and determine whether they are "anagrams" of each other.Anagrams are words with same no og each type
//eg listen,silent earth,heart live evil etc
//logic - add the frequency of each letter from 1st word in treemap/hashmap
//next ietrate in 2nd string & check whether letter xists inn treemap.if it exists and count>0.however if letter does't exists or it's count = 0,it means they are not anagrams
//twist - how will you compare 2 words with same letter but arranged in a diff combination

import java.util.*;

public class map2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.next();

        System.out.print("Enter second word: ");
        String word2 = sc.next();

        System.out.println("Are given 2 words anagrams of each other ? "+isAnagram(word1, word2));

        sc.close();
    }    
    // Static method to check anagram using HashMap
    static boolean isAnagram(String word1, String word2) {
    //case-1, if length of 2 words is not same ,100% they are not agnarams
        // Convert both words to lowercase
        
        if (word1.length() != word2.length())     // If lengtlive hs are different, they cannot be anagrams
            return false;

        TreeMap<Character, Integer> tm = new TreeMap<>();  
        //add all letters and their frequencies to tm
        for (int i = 0; i < word1.length(); i++) {      // Count frequency of characters in first word
            char ch = word1.charAt(i);

            if (!tm.containsKey(ch))
                tm.put(ch, 1);
            else{
                int count =tm.get(ch);
                count++;
                tm.put(ch,count);
            }
        }

        for (int i = 0; i < word2.length(); i++) {       // Decrease frequency using second word
            char ch = word2.charAt(i);

            if (!tm.containsKey(ch))  // Character not found
                return false;

            int count = tm.get(ch);

            if (count == 0)  // Remove character if frequency becomes 0
                return false;
                count--;
                tm.put(ch,count);
        }

        // If map is empty, both words are anagrams
        return true;
    }
}

