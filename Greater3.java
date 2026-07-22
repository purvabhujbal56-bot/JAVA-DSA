//write method to return the 1st 3 maximum element from given array

import java.util.Arrays;

class Greater3
{
	public static void main(String args[])
	{
		int nos[] = {10,12,8,16,4,13,5};
		System.out.println("Given nos[] is"+Arrays.toString(nos));
		int result[] = getThreeMaxNos(nos);
		System.out.println("1st largest element is "+result[0]);
		System.out.println("2st largest element is "+result[1]);
		System.out.println("3st largest element is "+result[2]);
	}
	static int[] getThreeMaxNos(int nos[])
	{
		int m1,m2,m3;
		m1 = m2 = m3 = Integer.MIN_VALUE;
		//now iterate in array & compare the current value 
		for(int i = 0;i<nos.length;i++)
		{
			if(m1<nos[i])
			{
				m3 = m2;
				m2 = m1;
				m1 = nos[i];
			}
			else if(m2<nos[i])
			{
				m3 = m2;
				m2 = nos[i];
			}
			else if(m3<nos[i])
			{
				m3 = nos[i];
			}

		}
			//get result in array
			int result[] = new int[3];
			result[0] = m1;
			result[1] = m2;
			result[2] = m3;
			return result;
			
		
	}
}