package Hashing;
import java.util.*;

public class HashTableDS {
	
	public static void main (String args[]) {
		
		/*----------hashtable ------------------------- 
		 
		 Hash Table is synchronized, and is generally used when threading is involved
		 can also be shared with many threads 
		 
		 To successfully store and retrieve objects from a HashTable, 
		 
		 the objects used as keys must implement the hashCode method and the equals method.
		 Since null is not an object, it can’t implement these methods.
		 */
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
        ht.put(101," ajay"); 
        ht.put(105,"Vijay"); 
        ht.put(102,"Ravi"); 
        ht.put(918,"Rahul"); 
        System.out.println("-------------Hash table--------------"); 
        for (Map.Entry m:ht.entrySet()) { 
            System.out.println(m.getKey()+" "+m.getValue()); 
        } 
  
        /*----------------hashmap-------------------------------- 
         
         Hash Map is not synchronized, it is not thread safe and can't be shared between 
         many threads without synchronization 
         
         Hash Map allows one null key and value 
         
         
         */
        
        HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
        hm.put(null,"Amit"); 
        hm.put(109,"Amit");   
        hm.put(101,"Vijay"); 
        hm.put(102,"Rahul"); 
        System.out.println("-----------Hash map-----------"); 
        for (Map.Entry m:hm.entrySet()) { 
            System.out.println(m.getKey()+" "+m.getValue()); 
        } 
	}

}
