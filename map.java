package DSA;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;

public class map {
 public static void main(String args[])
 {// Creating a empty hash map by declaring object.
	 // Adding elements in the map using put function.
	 
//	 HashMap<String,Integer> map=new HashMap(); //Hashmap has two parts key and value
//	 map.put("vishal",10); // put is used to enter the Key/value pair.
//	 map.put("sachin", 20);
//	 map.put("vaibhav",50);
//	 map.put("vishal", 90);// only the updated value of duplicate key is shown
//	 map.put("sohan", null);// null value is allowed here.
//	 System.out.println("Size of map is:"+map.size());
//	 System.out.println(map);
//	 System.out.println(map.get("sachin")); // get is used to access the  content by using key
	 
//	 Hashtable<String,Integer> map=new Hashtable(); //Hashmap has two parts key and value
//	 map.put("vishal",10); // put is used to enter the Key/value pair.
//	 map.put("sachin", 20);
//	 map.put("vaibhav",50);
//	 map.put("vishal", 90);// only the updated value of duplicate key is shown
//		 System.out.println("Size of map is:"+map.size());
//	 System.out.println(map);
//	 System.out.println(map.get("sachin"));	 
	 
	 
	 Properties p=new Properties();
	 p.setProperty("ranchi", "chandan");// only string is allowed in it 
	 p.setProperty("dhanbad", "nadan");
	 p.setProperty("tata", "annu");
	 p.setProperty("bokaro", "ajeet");
	 p.setProperty("bokdaro", "aman");
	
	 System.out.println(p);
	 System.out.println(p.getProperty("bokaro"));
//p.remove("tata");
//System.out.println(p);
//p.clear();System.out.println(p);
p.size();
 }

}

