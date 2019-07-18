import java.util.HashMap;

public class HashM {
public static void main(String[] args) {
	HashMap<Integer,Integer> smap= new HashMap<Integer,Integer>();
	
	smap.put(1, 20);
	smap.put(1, 22);
	
	for(Integer key:smap.keySet())
		System.out.println(key+" "+smap.get(key));
	
	
}
}
