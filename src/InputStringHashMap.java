import java.util.*;
public class InputStringHashMap {
public static void main(String[] args) {
	HashMap <Integer,String> map=new HashMap<Integer,String>();
	map.put(100,"Arjun");
	map.put(200,"Sammar");
	map.put(100,"Arjun");
	map.put(300,"Krishna");
	map.put(200,"Sammar");
	
	for(Integer key:map.keySet())
	{
		System.out.println(key +" "+map.get(key));
	}
}
}
