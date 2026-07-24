//Accept the set of words from user and display the frequency of each letter
//eg if string is "p r pote college" o/p c-1,e-3,g-1,....
//logic- here as letters are shown in alphabetical order , we will use a treemap instead of hashmap.
// the character /letter is key and value is its frequency..if its is 1st occurence of letter , we will add it to treeMap with value 1 .
//for next occurences ,we will increment value in front of letter by 1

import java.util.*;

class map1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sent = sc.nextLine(); //accepts strings with space
        TreeMap<Character,Integer> tm;
        tm = getFrequencyCount(sent);
        System.out.println("Letters and there frequencies are : "+tm);

        sc.close();
    }
    static TreeMap<Character,Integer> getFrequencyCount(String sent){
        TreeMap<Character,Integer> tm = new TreeMap<>();
        //analyse every char from given string 
        for (int i = 0; i < sent.length(); i++) {
            char ch = sent.charAt(i);
            if (ch==' ')   //ignore if space
                continue;
            if(!tm.containsKey(ch))
                tm.put(ch,1 ); // 1st occurence of letter ch
            else //subsequent occurence
            {
                //retrive the previous count 
                int count = tm.get(ch);
                count++;
                tm.put(ch,count);
            }
        }
        return tm;
    }
}
