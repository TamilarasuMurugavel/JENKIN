package task2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Enumeration1 {
	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("123");
		v.add("456");
		v.add("789");
		Enumeration<String> elements = v.elements();
		while(elements.hasMoreElements()) {
			String nextElement =(String) elements.nextElement();
			System.out.println(nextElement);
		}
		Iterator<String> iterator = v.iterator();
		while(iterator.hasNext()) {
			String next = (String)iterator.next();
			if (next=="123") {
				iterator.remove();
				
			}
		}
		
		System.out.println(v);
		ListIterator<String> listIterator = v.listIterator();
		while(listIterator.hasNext()) {
			String next = listIterator.next();
			if (next=="456") {
				listIterator.remove();
				
			}
		}
		System.out.println(v);
	}

}
