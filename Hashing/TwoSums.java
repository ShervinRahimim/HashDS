package Hashing;
import java.util.*;

public class TwoSums {
	
	public static void main (String args[]) {
	
	int  [] nums  = {2,7,11,15};
	int target = 26;
;
	
	long startTime1 = System.nanoTime(); 
	int [] result1 = twoSumsBrute(nums,target);
	long estimatedTime1 = System.nanoTime() - startTime1;
	
	long startTime2 = System.nanoTime();
	int [] result2 = twoSumsHash1(nums, target);
	long estimatedTime2 = System.nanoTime() - startTime2;
	
	long startTime3 = System.nanoTime();
	int [] result3 = twoSumsHash2(nums, target);
	long estimatedTime3 = System.nanoTime() - startTime3;
	
	System.out.println("The indices of two numbers that add up to target number are " +  result1[0] + " and " + result1[1]);
	System.out.println("Brute Force approach takes: " + estimatedTime1 + " nanoseconds\n");
	System.out.println("The indices of two numbers that add up to target number are " +  result2[0] + " and " + result2[1]);
	System.out.println("Hash Map Two Pass takes: " + estimatedTime2 + " nanoseconds\n");
	System.out.println("The indices of two numbers that add up to target number are " +  result3[0] + " and " + result3[1]);
	System.out.println("Hash Map Two Pass takes: " + estimatedTime3 + " nanoseconds\n");
	}
	
	// Time Complexity = O(n^2) since we have to loop twice 
	public static int [] twoSumsBrute(int[] nums, int target) {
		
		for(int i = 0; i < nums.length; i++) {
			
			for(int j = i + 1; j < nums.length; j++) {
				
				if(target == nums[i] + nums[j]) {
					
					return new int [] {i,j};
				}
			}
		}
			
		throw new IllegalArgumentException("No two numbers add up to the target number!");
	}
	
	public static int [] twoSumsHash1(int[] nums, int target) {
		
		// Time Complexity = O(n) since we traverse n times 
		Map<Integer,Integer> hash1 = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			
			// mapping key -> value 
			hash1.put(nums[i], i);
		
		}
		for(int i = 0; i < nums.length; i++) {
			
			int complement = target - nums[i];
			
			// if hash contains key ex: complement = 26-15 = 11, yes it contains this key, return index i as well as position of complement [4]
			if(hash1.containsKey(complement)) {
				
				return new int [] {i, hash1.get(complement)};
			}
		}
		throw new IllegalArgumentException("No two numbers add up to the target number!");
	}
	
	public static int [] twoSumsHash2(int [] nums, int target) {
		
		Map<Integer,Integer> hash2 = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			
			int complement = target - nums[i];
			
			if(hash2.containsKey(complement)) {
				
				return new int [] {hash2.get(complement), i};
			}
			hash2.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No two numbers add up to the target number!");
	}

}
