//write a method to return minimum value from given array of integers
class Prog1
{
	public static void main(String args[])
	{
		int nos[]={10,0,-87,176,95,11};
		System.out.print("Given array nos[] contains");
		for(int i=0;i<nos.length;i++)
			System.out.print(nos[i]+"");

		int min = getMin(nos);
		System.out.print("\n Minimum no from given nos[] is"+min);
	}
	static int getMin(int nos[])
	{
		int min = Integer.MAX_VALUE;  //2147483647(2^31 -1)
		//analyse each element in array & follow a greedy approach
		for(int i=0;i<nos.length;i++)
		{
			if(min>nos[i])       //if min>current element in array,assgin that value to min
				min=nos[i];
		}
		return min;

	}
}