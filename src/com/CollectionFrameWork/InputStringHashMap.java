package com.CollectionFrameWork;
import java.util.*;
public class InputStringHashMap {
public static void main(String[] args) {
	HashMap <Integer,String> map=new HashMap<Integer,String>();

	map.put(200,"Sammar");
	map.put(100,"Arjun");
	map.put(100,"Ram");
	map.put(300,"Krishna");
	map.put(400,"Sammit");
	
	for(Integer key:map.keySet())
	{
		System.out.println(key +" "+map.get(key));
	}
	System.out.println("\n");
	
		System.out.println(map.get(200));
		
		
	//list of initial elements 
		System.out.println(map);
	//key based removal
		map.remove(100);
		System.out.println(map);
	//key-value based removal
		map.remove(300,"Krishna");
		System.out.println(map);
	
	
}
}
