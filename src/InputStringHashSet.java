import java.util.*;
public class InputStringHashSet {
	public static void main(String[] args) {
		HashSet <String> uniqueName=new HashSet<String>();
		uniqueName.add("Arjun");
		uniqueName.add("Hari");
		uniqueName.add("Arjun");
		uniqueName.add("Sita");
		for(String name:uniqueName)
	
	{
			System.out.println(name);
		}
	}

}
