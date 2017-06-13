package Collections;

import java.util.ArrayList;
import java.util.Hashtable;

public class Collections_Api {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list.get(2));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		
		/*************HASH TABLE***********************/
		
		Hashtable<String,String> table=new Hashtable<String,String>();
		table.put("name", "Manasa");
		table.put("place", "Hyderabad");
		table.put("profession", "IT");
		System.out.println(table.get("name"));
		System.out.println(table.get("profession"));
		

	}

}
