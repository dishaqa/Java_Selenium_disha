package String_functions;

public class Matchfunctions
{

	public static void main(String[] args)
	{
		String a ="ramu";
		System.out.println(a.matches("r(.*)"));
		System.out.println(a.matches("...."));
		System.out.println(a.matches("(.*)u"));
		System.out.println(a.matches("(.*)m(.*)"));

	}

}
