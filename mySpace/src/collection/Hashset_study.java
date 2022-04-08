package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_study {

	public static void main(String[] args) {
		
	HashSet<Object> hs=new HashSet<>();
	hs.add("Pune");
	hs.add(null);
	hs.add(100);
	hs.add(null);
	hs.add("pune");
	hs.add(100);
	hs.add("velocity");
	hs.add(27);
	hs.add(27);
	
	System.out.println(hs);
	System.out.println(hs.add("Ashish"));
	hs.add(45);
	hs.add(54);
	System.out.println(hs);
	
	System.out.println("======for each loop===============");
	for(Object o:hs) {
		System.out.println(o);
	}
	System.out.println("========iterator=================");
	Iterator<Object> it = hs.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

	}

}
