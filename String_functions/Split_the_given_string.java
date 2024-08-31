package String_functions;

import java.util.Arrays;

public class Split_the_given_string 
{

	public static void main(String[] args)
	{
	String a = "Manish Kumar Tiwari";
	String []name =a.split(" ");
	System.out.println(Arrays.toString(name));
	
	String name1[] = a.split(" ", 2);
	System.out.println(Arrays.toString(name1));
	
	System.out.println(a.repeat(3));
	
	
	String b = "manish";
	String c = "";
	System.out.println(b.endsWith("h"));
	System.out.println(c.isEmpty());
	}

}
