package Collections;

import java.util.ArrayList;

public class arrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a  = new ArrayList<String>();
		a.add("Jones");
		a.add("Java");
		System.out.println(a);
		a.add(0, "Student");
		System.out.println(a);
//		a.remove(1);
//		a.remove("Java");
//		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("Java"));
		System.out.println(a.indexOf("Jones"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
/*

// can accept duplicate values 
 * //ArraList,LinkedList,vector- Implementing List interface 
 * //array have fixed size where as arraylist can grow dynamicaly 
 * //you can access and insert any value in any index private int i =5; */

