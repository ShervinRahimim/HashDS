package Hashing;

import java.util.HashMap;
import java.util.Map;

public class testint {

	public static void main (String args[]) {
		
		int [] arr = new int [] {2,5,8,20,12};
		int target = 10;
		int [] result = hashNums2(arr,target);
		System.out.println(result[0] + "," + result[1]);
	}
	
	public static int [] twoNums(int [] arr, int target) {
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] + arr[j] == target) {
					
					return new int [] {i,j};
				}
			}
		}
		
		throw new IllegalArgumentException("No two numbers add up to target num!");
	}
	
	public static int [] hashNums(int [] arr, int target) {
		
		Map<Integer,Integer> hs1 = new HashMap<Integer,Integer>();
		
		int complement = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			complement = target - arr[i]; 
			
			if(hs1.containsKey(complement)) {
				
				return new int [] {hs1.get(complement),i};
			}
			
			hs1.put(arr[i], i);
		}
		
		throw new IllegalArgumentException("No two numbers add up to target num!");
	}
	
	public static int [] hashNums2(int [] arr, int target) {
		
		Map<Integer,Integer> hsh2 = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			
			hsh2.put(arr[i], i);
		}
		
		int complement = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			complement = target - arr[i];
			
			if(hsh2.containsKey(complement)) {
				
				return new int [] {i,hsh2.get(complement)};
			}
		}
		
		throw new IllegalArgumentException("No two numbers add up to target num!");
		
		
		
	}
}
