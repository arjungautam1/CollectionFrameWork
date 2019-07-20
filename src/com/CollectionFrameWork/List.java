package com.CollectionFrameWork;
import java.util.*;

public class List {
	public static void main(String[] args) {
		ArrayList<Integer> rollNos = new ArrayList<Integer>();
		rollNos.add(1);
		rollNos.add(2);
		rollNos.add(4);
		rollNos.add(3);

		// System.out.println(rollNo);

		System.out.println("Total number of RollNos:" + rollNos.size());
		for (int i = 0; i < rollNos.size(); i++) {
			System.out.println(rollNos.get(i));
		}
		System.out.println("\n");

		System.out.println("Java Enhanced for Loop");
		for (Integer i : rollNos)
			System.out.println(i);

		System.out.println("\n");

		/*
		 * System.out.println("Stream /Lamda based loop ");
		 * rollNos.forEach(r->System.out.print(r));
		 * 
		 * rollNos.forEach(r->{ System.out.println(r); });
		 */
		System.out.println(rollNos.get(2));
		
		System.out.println("Last Index");
		int lastIndex=rollNos.size()-1;
		System.out.println(rollNos.get(lastIndex));
		
		System.out.println("Before Sorting ");
		rollNos.forEach(r->System.out.println(r));
		System.out.println("After sorting ");
		Collections.sort(rollNos);
		rollNos.forEach(r->System.out.println(r));
	//	System.out.println(rollNos);
		System.out.println("\n");
		rollNos.sort(Comparator.reverseOrder());
		rollNos.forEach(r->System.out.println(r));
		
		
	}
}
