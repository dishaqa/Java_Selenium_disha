package String_functions;

public class StrignStartWith {

	public static void main(String[] args) {
		String name = "Disha";
		System.out.println(name.matches("D(.*)"));
		System.out.println(name.matches("...."));
		System.out.println(name.matches("(.*)a"));
		System.out.println(name.matches("(.*)h(.*)"));

	}

}
