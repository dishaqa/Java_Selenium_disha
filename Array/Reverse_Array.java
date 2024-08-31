package Array;


import java.util.Arrays;

public class Reverse_Array 
{

	public static void main(String[] args) 
	{
		
		int origianl_Array[] = new int[5];
		int reverse_array[] = new int[5];
		
		origianl_Array[0] = 10;
		origianl_Array[1] = 15;
		origianl_Array[2] = 13;
		origianl_Array[3] = 144;
		origianl_Array[4] = 155;
		
		for (int i=0,k=origianl_Array.length-1;i<origianl_Array.length;i++,k--)
		{
			//System.out.println(i);
			reverse_array[i]= origianl_Array[k];
			
		}
		System.out.println("Reverse Array");
		System.out.println(Arrays.toString(reverse_array));
		
		System.out.println("Original Array");
		System.out.println(Arrays.toString(origianl_Array));
		
	}

}
