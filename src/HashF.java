import java.util.*;
public class HashF {
public static void main(String[] args) {

	HashSet <Integer> uniqueRolls = new HashSet<Integer>();
	uniqueRolls.add(1);
	uniqueRolls.add(2);
	uniqueRolls.add(1);
	
	
	for(Integer value:uniqueRolls)
		System.out.println(value);
	
}
}
