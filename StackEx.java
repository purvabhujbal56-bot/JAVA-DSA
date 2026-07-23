//using stack,dtermine whether expression is valid or not 
//note that this expression does't contain operands or operators but only parathesis.
//i.p {} o.p true i.p{[]} o.p true i.p ] o/p false i.p {(}) o.p false
//logic - read expression from left to right .if it is opening parenthesis,push it in stack .
// if its closing parenthiesis ,pop the opening parenthesis from stack& check whther it matches with closing parenthesis or not

import java.util.*;


public class StackEx {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the expression:");
        String expr = sc.next();
        System.out.println("Is the expression valid or not ? "+isValid(expr));
    }
    static boolean isValid(String expr)
    {
        Stack<Character> stk = new Stack<>();
        //not char bcz char is pdt and generics in java support object type only analyse each character in given expression
        for(int i=0;i<expr.length();i++)
        {
            char ch1 = expr.charAt(i); //string do not support indexing
            if (ch1 =='{' || ch1=='(' || ch1 =='[') 
                stk.push(ch1);
            else             //closing parenthesis
            {
                //case-1 check whether stack is empty or not 
                if (stk.isEmpty()) 
                    return false;
                char ch2 = stk.pop(); //opening
                if ((ch1 =='}'&& ch2!='{')||(ch1==')'&&ch2!='(')||(ch1==']'&& ch2!='[')) 
                    
                    return false;
            }//end of expression  reached 
        }    //case-2 if stack is not empty ,it means some opening parenthesis remain in stack
        if (!stk.isEmpty()) 
            return false;
        return true;
    }
}
