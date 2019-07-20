package com.CollectionFrameWork;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class InputStringArrayList
{
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Arjun");
		list.add("Ram");
		list.add("Hari");
		list.add("Krishna");
		System.out.println(list);
		//using for each loop
		for(String str:list)
		{
			System.out.println(str);
		}
		System.out.println("\n");
		//using for loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("\n Using Lamda expression .");
		//using lamda expression 
		list.forEach(l->System.out.println(l));
		//for sorting using lamda expression 
		System.out.println("\n Sorted using lamda expressions");
		Collections.sort(list);
		list.forEach(l->System.out.println(l));
		System.out.println("\n Sorting name in reverse order:");
		//for printing in reverse order 
		list.sort(Comparator.reverseOrder());
		list.forEach(r->System.out.println(r));
		
		
	}
}