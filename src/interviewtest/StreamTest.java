package interviewtest;

import java.util.Comparator;

public class StreamTest {
	public static void main(String[] args) {
		String input="vijayawdaja";
		Character result = input.chars()
	            .mapToObj(c -> (char) c)
	            // Filter: only keep if first occurrence is NOT the last occurrence
	            .filter(c -> input.indexOf(c) != input.lastIndexOf(c))
	            .distinct()                           // Unique list of repeats
	            .sorted(Comparator.reverseOrder())    // Biggest to smallest
	            .skip(2)                              // Skip 1st and 2nd
	            .findFirst()                          // Get 3rd
	            .orElse(null);

	        System.out.println("Third biggest repeated character: " + result);
	        
	        
	    	String items[]={"java","c","c++"};
	    	for (String string : items) {
				System.out.println(string);
				System.out.println("demo 1234565");
			}

	}
	

}
