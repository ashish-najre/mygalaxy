package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class Arraylist_study {

	public static void main(String[] args) {
		
		ArrayList<Object> at=new ArrayList<>();
		
		at.add(12);
		at.add("Ashish");
		at.add(125.25f);
		at.add('N');
		at.add(null);
		at.add('N');
		at.add(null);
		at.add("Ashish");
		at.add(25);
		at.add(null);
		at.add(12);
		
		System.out.println(at);
		System.out.println(at.size());
		System.out.println(at.contains("Ashish"));
		System.out.println(at.isEmpty());
		System.out.println(at.lastIndexOf("Ashish"));
		System.out.println(at.indexOf("Ashish"));
		System.out.println(at.equals(at));
		System.out.println(at.contains(22));
		System.out.println("==============Using for loop================");
		for (int i = 0; i < at.size(); i++) {
			
			System.out.println(at.get(i));
		}
		
		System.out.println("============Using Iterator===================");
		// Use Of ITERATOR
		Iterator<Object> it=at.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("===========Using for each loop=============");
		// use of FOR EACH LOOP
		for(Object b:at) {
			System.out.println(b);
		}
		
	}

}
