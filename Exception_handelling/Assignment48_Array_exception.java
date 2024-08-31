package Exception_handelling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment48_Array_exception 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the size of Array");
		Scanner s1 = new Scanner(System.in);
		
		int i;
		try 
		{
		i = s1.nextInt();
		}
		
		catch (InputMismatchException a1)//Handled InputMismatchException
		{
			System.out.println("Hey please check the input and add it properly");
			Scanner s2 =new Scanner(System.in);
			i = s2.nextInt();
			//s2.close();
		}
		//System.out.println(i);
		double rollno[]= new double[i];
		//System.out.println(rollno.length);
		Scanner s3 =new Scanner(System.in);
		for (int j=0;j<=rollno.length; j++)
		{
			System.out.println("enter value of rollno "+(j+1));
			try
			{
				rollno[j] = s3.nextDouble();
			}
			catch (ArrayIndexOutOfBoundsException a1) //Handled ArrayIndexOutOfBoundsException
			{
				System.out.println("Exception HandledArrayIndexOutOfBoundsException ");
			}
		
		}
		System.out.println(Arrays.toString(rollno));
		s1.close();
	
	}
	
}
