import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Datastructure {
	public static void main(String args[])
	{
		/*//ArrayList
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Suhani");
		arrayList.add("Riya");
		arrayList.add(2,"Some Name");  //inserting element in between 2 elements
		
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i));
		}
		//arrayList.clear();
		System.out.println(arrayList.contains("Suhani"));
		
		arrayList.forEach(word -> {      //foreach is same as forloop
			System.out.println(word);
		});*/
		
	/*	//LinkedList
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Suhani");
		linkedList.add("Riya");
		linkedList.add("Arun");
		for(String word: linkedList) {
			System.out.println(word);
		}
		linkedList.addFirst("First Element");
		linkedList.addLast("Last Element");
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		System.out.println("After removing First & Last Element");
		for(String word: linkedList) {
			System.out.println(word);
		}*/
		
	/*	//HashMap
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("name 1", "Suhani");
		hashMap.put("name 2", "Test");
		hashMap.put("name 3", "Test2");
		hashMap.put("name 4", "Test3");
		hashMap.put("name 4", "Test3");

		System.out.println(hashMap.get("name 5"));
		
		hashMap.forEach((key,value) -> System.out.println(key + "-" + value));
		
		for(String key: hashMap.keySet())
		{
			System.out.println(key+ "-" + hashMap.get(key));
		}*/
		
		///Hash Set
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Suhani");
		hashSet.add("Suhani");
		hashSet.add("Suhani");
		hashSet.add("Test");
		hashSet.add("Test2");
		hashSet.add("Test3");

//		for(String value : hashSet)
//		{
//			System.out.println(value);
//		}
		
		Iterator<String> it = hashSet.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
