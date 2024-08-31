package Assignments;

public class Assignment4_method_overloading
{
	//static method
	static void add()
	{
		System.out.println("this is non parameterize method.");
	}
	
	static void add(int a)
	{
		System.out.println("paramererized method overloading and printing number"+a);
	}	
	// non static method with method overloading
	void add(int b,char c)
	{
		System.out.println("parametirized non static method" + " Print number " + b + "print char " + 'c');
	}
	public static void main(String[] args)
	{
		add();
		add(10);
		Assignment4_method_overloading a1 = new Assignment4_method_overloading();
		a1.add(10, 'c');

	}

}
