package Hashing;
import java.util.*;

public class TicketMap {
	
	public static void main (String args[]) {
		
		// creating hash map of strings <Key,Value>
		HashMap<String,String> ticketMap = new HashMap<String,String>();
		
		ticketMap.put("Chennai", "Banglore");
		ticketMap.put("Bombay", "Delhi");
		ticketMap.put("Goa", "Chennai");
		ticketMap.put("Delhi", "Goa");
		
		printMap(ticketMap);
	}
	
	public static void printMap(HashMap<String,String> dataSet) {
		
		Map<String,String> reverseMap = new HashMap<String,String>();
		
		for(Map.Entry<String,String> entry: dataSet.entrySet()) {
			
			reverseMap.put(entry.getValue(), entry.getKey());
			/* reverse map -> 
			 * Banglore, Chennai
			 * Delhi, Bombay
			 * Chennai, Goa
			 * Goa, Delhi 
			 */
			
		}
		String start = null;
		
		for (Map.Entry<String,String> entry: dataSet.entrySet()) { 
			
			/* 
			 if(!reverseMap.containsKey(entry.getKey(Chennai))
			 if(!True)
			 if(False) 
			 
			 if(!reverseMap.containsKey(entry.getKey(Bombay))
			 if(!False)
			 if(True) 
			 
			 if(!reverseMap.containsKey(entry.getKey(Goa))
			 if(!True)
			 if(False) 
			 
			 if(!reverseMap.containsKey(entry.getKey(Delhi))
			 if(!True)
			 if(False) 
			 
			 start = Bombay
			 break
			 
			 */
              if (!reverseMap.containsKey(entry.getKey())) { 
                   start = entry.getKey(); 
                   break; 
              } 
        } 
		// skips
		if (start == null) { 
			
           System.out.println("Invalid Input"); 
           return; 
        } 
		
        String to = dataSet.get(start); // returns value of start , start is the key 
        while (to != null) { 
        	// Start = Bombay -> Delhi 
            System.out.print(start +   "-> " + to + ", "); 
            start = to; 
            to = dataSet.get(to); 
            
            /*
   		 		String to = dataSet.get(Delhi)
   		 		
   		 		Bombay -> Delhi
   		 		start = Delhi
   		 		to = dataSet.get(Goa) 
   		 
   		 		Delhi -> Goa
   		 		start = Goa
   		 		to = dataSet.get(Chennai)
   		 		
   		 		Goa -> Chennai
   		 		start = Chennai
   		 		to = dataSet.get(Banglore)
   		 		to = null
   		 		while loop terminates!
   		   */
        } 
		
	}
	

}
