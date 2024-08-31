package String_functions;

public class CharAtString {

	public static void main(String[] args) {

		String name = "SOHAM";
		
		for (int i=0;i<name.length();i++)
		{
		char a1 = name.charAt(i);
		System.out.print("the character at index "+i +" is-->");
		System.out.println(a1);
		}
	}

}
