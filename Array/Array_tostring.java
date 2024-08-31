package Array;

import java.util.Arrays;

public class Array_tostring {

	public static void main(String[] args) {
	int rollno[] = new int[3];
	rollno[1]=81;
	rollno[2]=13;
	rollno[0]=10;
	Arrays.sort(rollno);
	System.out.println(Arrays.toString(rollno));
	
	
	String name[] = new String[4];
	
	name[0]="uma";
	name[1]="disha";
	name[2]="Amba";
	name[3]=null;
	//Arrays.sort(name);
	
	System.out.println(Arrays.toString(name));
	
	
	
	
	}

}
