package Array;

public class Avarage_Value 
{

	public static void main(String[] args)
	{
		int numbers[] = new int[4];
		numbers[0]=17;
		numbers[1]=35;
		numbers[2]=81;
		numbers[3]=42;
		
		double sum =0;
		double avarage =0;
		
		for (int i=0;i<numbers.length;i++)
		{
			sum = sum +numbers[i];
		}
		
		System.out.println("sum of given number is   :"+sum);
		avarage = sum/numbers.length;
		System.out.println("avarage of all the number is   :"+avarage);
	}

}
