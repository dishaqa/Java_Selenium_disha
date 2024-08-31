package Type_Casting;

class Parent_C{
	static void parentMe1() {
		System.out.println("Static parent method1");
	}
	
	static void parentMe2() {
		System.out.println("Static parent method2");
	}
	
	void nonMe1() {
		System.out.println("Non-staic parent method1");
	}
	
	void nonMe2() {
		System.out.println("Non-static parent method2");
	}
}

public class Upcasting_DowncastingAssign  extends Parent_C {
	
	static void childMe1() {
		System.out.println("Static child method1");
	}
	
	static void childMe2() {
		System.out.println("Static child method2");
	}
	
	void nonchildMe1() {
		System.out.println("Non-staic child method1");
	}
	
	void nonchildMe2() {
		System.out.println("Non-static child method2");
	}
	
	
	public static void main(String[] args) {
		
		Parent_C p1 =new Upcasting_DowncastingAssign(); //upcasting
		parentMe1();
		parentMe2();
		p1.nonMe1();
		p1.nonMe2();
		
		Upcasting_DowncastingAssign u1=(Upcasting_DowncastingAssign)p1; //Downcasting
		parentMe1();
		parentMe2();
		childMe1();
		childMe2();
		u1.nonMe1();
		u1.nonMe2();
		u1.nonchildMe1();
		u1.nonchildMe2();
		
		
	
		
	}
}
