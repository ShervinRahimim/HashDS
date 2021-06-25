package Hashing;
import java.util.*;
public class HashSetDS {
	
	public static void main (String args[]) {
		
		Set<String> set1 = new HashSet<String>();
		
		set1.add("Shervin");
		set1.add("Erika");
		set1.add("Ginge");
		set1.add("Ginge");
		
		System.out.println("Size of Hash Set is " + set1.size());
		System.out.println(set1);
		System.out.println(set1.isEmpty());
		System.out.println(set1.hashCode());
		
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			
			System.out.println(it1.next());
		}
		
		Object [] s1 = set1.toArray();
		for(int i = 0; i < s1.length; i++) {
			
			System.out.println(s1[i]);
		
		}
		
		if(set1.contains("Tadeh")) {
			
			System.out.println("Bozitxa");
		}
		else {
			
			System.out.println("Not in the set!");
		}
		
		int [] arrSet = {2,4,2,8,24,8,16,12,19,12};
		
		findDuplicate(arrSet);
		
		
	}
	
	public static void findDuplicate(int [] arr) {
		
		Set<Integer> s2 = new HashSet<Integer>();
		
		// traverse through the hash set 
		for(int x : arr) {
			
			// if we cannot add this element x , duplicate exists! we use !(false) = True to print the duplicate and number x 
			if(!s2.add(x)) {
				
				System.out.println("This duplicate exists: " + x);
			}
		}
	}
	
	

}
