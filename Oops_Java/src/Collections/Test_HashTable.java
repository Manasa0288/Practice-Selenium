package Collections;

import java.util.Hashtable;

public class Test_HashTable {

	public static void main(String[] args) {
		Hashtable<String,String> table1=new Hashtable<String,String>();
		table1.put("city1", "London");
		table1.put("city2", "Delhi");
		table1.put("city3", "Mumbai");
		Hashtable<String,String> table2=new Hashtable<String,String>();
		table2.put("city1", "33333");
		table2.put("city2", "1212");
		table2.put("city3", "4848");
		Hashtable<String,Hashtable<String,String>> Table=new Hashtable<String,Hashtable<String,String>>();
		Table.put("name",table1);
		Table.put("name",table1);
		System.out.println(Table.get("name").get("city3"));
		

	}

}
