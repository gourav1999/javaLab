import java.util.*;

public class program
{
	public float test(int numbers[])
	{
		/*
		Exercise 14: Average of numbers- Given an array of integers finds the average
		of all the elements. For e.g. for {4,7,9,4} the average is 6 and for {1,3,8,5} the
		average is 4.25. Please note that if the array has no elements, the average should
		be 0.
		*/
        float sum=0;
		for(float num: numbers)
	    {
			sum += num;
		}
		return sum/numbers.length;
	} 
 
	public static void main(String args[])
	{
		program o1 = new program();
		int[] a = {3,3};
		if(a.length==0)
		{
			System.out.println("0");
		}
		else
		{
			System.out.println(o1.test(a));
		}
	}
}
