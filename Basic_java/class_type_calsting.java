package Basic_java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class parentType1
{
	
}

public class class_type_calsting extends parentType1
{
	static void add()
	{
	
	}
	public static void main(String[] args)
	{
		
				Object o1=	new class_type_calsting(); //upcasting
				// Array list to list 
				//List l1 =new ArrayList();
				//Collection c1 = new ArrayList();
				
				parentType1 p1 = new class_type_calsting();  // upcasting
				class_type_calsting c1 = (class_type_calsting) p1 ; // down casting explicitly
				
				
	}

}
