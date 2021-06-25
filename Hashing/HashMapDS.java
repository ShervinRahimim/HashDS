package Hashing;
/* Hash Map 
Node<K,V>
int hash
K key
V Value
Node<K,V> next 
Hash Map is a map that implements map interface
initial capacity is 2^4 = 16 pairs of key,value
rehashing takes place after 75% capacity is full 

Hash Map represents a hash table which is implemented by using
an array and linked list 

array is used as a bucket, where linked list is used to store the mappings 

Algorithm Average Worst case Space O(n) O(n) Search O(1) O(n) Insert O(1) O(n) Delete O(1) O(n)
*/

import java.util.*;

public class HashMapDS {
	
	public static void main(String args[]) {
		
		//creating hash map of type string that maps to an -> integer
		//to initialize: HashMap<String,Integer> hash1 = new HashMap<String,Integer>();
		//HashMap() = HashMap(int Initial Capacity, load factor ) 
		
		HashMap<String,Integer> hash1 = new HashMap<String,Integer>();
		
		hash1.put("Shervin", 1);
		hash1.put("Angelo", 2);
		hash1.put("Shima", 3);
		hash1.put("Yessenia", 4);
		
		System.out.println(hash1);
		System.out.println("Size of map is " + hash1.size());
		
		if(hash1.containsKey("Yessenia")) {
			
			Integer val = hash1.get("Yessenia");
			System.out.println(val);
		}
		
		//Mapping hash1 to hash2 
		HashMap<String,Integer> hash2 = new HashMap<String,Integer>(hash1);
		System.out.println(hash2);
		hash2.remove("Angelo");
		hash2.replace("Yessenia", 33);
		System.out.println(hash2);
		
		// for - each loop vs for loop 
		/* for(int i = 0; i < arr.length; i++)
		      type var = arr[i];
		      statements using var
		      
		    for(type var : array)
			statements using var
		*/
		
		String [] cars = {"GTR" , "C8" , "S2000"};
		
		for(int i = 0; i < cars.length; i++) {
			
			System.out.println(cars[i]);
		}
		
		for(String car : cars) {
			
			System.out.println(car);
		}
		
	    //Traversal through hash map using for - each loop 
		
		//printing key only 
		for(String key : hash1.keySet()) {
			
			System.out.println(key);
		}
		//printing value only 
		for(Integer value : hash1.values()) {
			
			System.out.println(value);
		}
		//printing key and value 
		for(Map.Entry<String,Integer> set : hash1.entrySet()) {
			
			System.out.println(set.getKey() + " = " + set.getValue());
		}
		
		int [] arrMap = {2,4,12,2,17,23,17,18,8,4};
		findDuplicate(arrMap);
		
	}
	
	public static void findDuplicate(int [] arr) {
		
		// creating hash map 
		Map<Integer,Integer> hash3 = new HashMap<Integer,Integer>();
		
		// for each int loop through array 
		for(int x1 : arr) {
			
			// if hash map doesn't contain key, put 1 as its value 
			if(!hash3.containsKey(x1)) {
				
				hash3.put(x1,1);
			}
			// else put + 1 as its value 
			else {
				hash3.put(x1,hash3.get(x1) + 1);
			}
		}
		
		// for each Integer in the key of the hash map, check to see if value is > 1 
		for(Integer x2 : hash3.keySet()) {
			
			if(hash3.get(x2) > 1) {
				
				System.out.println("Duplicate element is: " + x2);
			}
			
		}
	}

}

