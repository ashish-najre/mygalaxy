package collection;

import java.util.Iterator;
import java.util.Vector;

public class Vector_study {

	public static void main(String[] args) {
		
		
		Vector<Object> vc=new Vector<>();
		vc.add(100);
		vc.add("pune");
		vc.add(100);
		vc.add(null);
		vc.add(125.30);
		vc.add(null);
		vc.add(100);
		
		System.out.println(vc);
		System.out.println(vc.contains(100));
		System.out.println(vc.size());
		vc.add(2,"metro");
		System.out.println(vc);
		vc.remove(3);
		System.out.println(vc);
		
		System.out.println("===========for loop============");
		
		for (int i = 0; i < vc.size(); i++)
		{
		System.out.println(vc.get(i));	
		}
		
		System.out.println("=========for each loop=====");
		for (Object o : vc) 
		{
		System.out.println(o);	
		}
		System.out.println("====Iterator====");
		Iterator<Object> it = vc.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
