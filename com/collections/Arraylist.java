package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String>myList=new ArrayList<String>();
		myList.add("Red");
		myList.add("blue");
		myList.add("green");
		myList.add("yellow");
		System.out.println(myList);
		myList.add(4, "black");
		List<String>list=myList.subList(0,3);
		System.out.println(list);
		Collections.swap(list, 0, 2);
		System.out.println(list);
		Iterator<String>it=myList.listIterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
		System.out.println(myList.contains("yellow"));
		System.out.println(myList.get(2));
		myList.set(0, "orange");
		
		//myList.remove(3);
		//Collections.sort(myList);
		
		
		//Collections.copy(myList, list);
		//Collections.shuffle(myList);
		//Collections.reverse(myList);
		ArrayList<String>comp=new ArrayList<String>();
		comp.addAll(list);
		comp.addAll(myList);
//		for(String e:myList) {
//			comp.add(list.contains(e)?"yes":"no");
//			
//		}
		System.out.println(comp);
	}

}
