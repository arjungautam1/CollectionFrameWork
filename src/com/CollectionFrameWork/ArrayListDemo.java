package com.CollectionFrameWork;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> rollNumbers=new ArrayList<Integer>();
		rollNumbers.add(1);
		rollNumbers.add(2);
		rollNumbers.add(5);
		rollNumbers.add(4);
		
		System.out.println("Total number of Roll Numbers :"+rollNumbers.size());
		
		System.out.println("Numbers in the array are : ");
		for(int i=0;i<rollNumbers.size();i++)
		{
			System.out.print(rollNumbers.get(i)+",");
		}
		
		System.out.println(" \n");
		
		System.out.println("Using Enhanced Loop .");
		for(Integer i:rollNumbers)
		{
			System.out.println(i);
	
		}
		System.out.println("\n");
		System.out.println(rollNumbers.get(2));
		
		int last=rollNumbers.size()-1;
		System.out.println("Last Index:"+last);
		System.out.println("Element of last index:"+rollNumbers.get(last));
		
		//for sorting 
		System.out.println("Numbers before sorting :");
		rollNumbers.forEach(r->System.out.println(r));
		
		System.out.println("After sorting ");
		Collections.sort(rollNumbers);
		rollNumbers.forEach(r->System.out.println(r));
		
		System.out.println("Printing in reverse order :");
		rollNumbers.sort(Comparator.reverseOrder());
		rollNumbers.forEach(r->System.out.println(r));
		
		
		System.out.println("Stream /Lamda based loop ");
		
		 rollNumbers.forEach(r->System.out.print(r));
		  System.out.println("\n");
		 rollNumbers.forEach(r->{ System.out.println(r); });
		
		 rollNumbers.forEach(a->{
             System.out.println(a);  
           });  
		 
		 
		 //for finding maximum value
		int maxi= Collections.max(rollNumbers);
		System.out.println("Maximum value in the array is :"+maxi);
		
		//for finding minimum value 
		int mini=Collections.min(rollNumbers);
		System.out.println("Minimum value in the array is :"+mini);
	}

}
