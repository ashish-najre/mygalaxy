package collection;

import java.util.LinkedList;

public class LinkedList_study {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<>();
		
		ll.add(15);
		ll.add(12);
		ll.add(null);
		ll.add(20);
		ll.add(15);
		ll.add(null);
		ll.add(20);
		ll.add(100);
		ll.add(22);;
		ll.add(2,50);
		
		System.out.println(ll);
		ll.remove(4);
		System.out.println(ll.get(4));
		

	}

}
