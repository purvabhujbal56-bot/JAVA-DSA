//give an array of +ve int digit as element .write a method to return array after adding 1 to last element

//eg: i.p{1,2,3} o.p{1,2,4} i.p{5,8,1,9} o.p{5,8,2,0} 

import java.util.Arrays;

class prog4
{
	public static void main(String args[])
	{
		int nos[] = {1,2,3};
		System.out.println("Initially nos[] contains" +Arrays.toString(nos));
		nos=addOne(nos);
		System.out.print("After adding 1 to last digit , nos[] contains"+Arrays.toString(nos));
	}
	static int[] addOne(int nos[])
	{
		for(int i=nos.length-1;i>=0;i--)
		{
			if(nos[i]!=9)
			{
				nos[i]++;
				return nos;
			}
			nos[i]=0;
        }
			int result[]=new int [nos.length+1];
			result[0]=1;
        
			return result;
		
	}
}
