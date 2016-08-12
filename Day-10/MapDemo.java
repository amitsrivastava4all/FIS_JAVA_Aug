import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// Set
		HashSet<String> set = new HashSet<>();
		set.add("amit");
		set.add("mike");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		// TODO Auto-generated method stub
		// HashMap is UnOrder
		HashMap<String,Integer> phoneMap = new HashMap<>();
		// String is Key and Integer is a Value
		phoneMap.put("amit", 2222);
		phoneMap.put("ram", 3333);
		phoneMap.put("ram", 1111);
		System.out.println(phoneMap);
		// Key is Not Duplicate and Key is String in this case
		// And String class override equals and hashCode to remove duplicate things
		// Map if u add a same key again so it will replace the old key value with the new key value 
		//System.out.println(phoneMap);
		//System.out.println(phoneMap.get("amit"));
		System.out.println("Map Data is ");
		Set<String> keys = phoneMap.keySet();
		Iterator<String> itrKeys = keys.iterator();
		while(itrKeys.hasNext()){
			String key = itrKeys.next();
			System.out.println("Key is "+key 
					+" And Value is "+phoneMap.get(key));
		}
		for(Map.Entry<String, Integer> keyValues: phoneMap.entrySet()){
			System.out.println(keyValues.getKey()+" "+keyValues.getValue());
		}
		
		HashMap<String,List<Integer>> phonemapobj = new HashMap<>();
		List<Integer> list  = Arrays.asList(10,20,30,40);
		phonemapobj.put("amit", list);
		System.out.println(phonemapobj.get("amit"));
		System.out.println(phonemapobj);
	}

}
