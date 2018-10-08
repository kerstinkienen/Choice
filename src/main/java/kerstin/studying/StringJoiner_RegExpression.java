package kerstin.studying;

import java.util.StringJoiner;

public class StringJoiner_RegExpression {

	
	 public static void main( String[] args )
	    {	
			// StringJoiner with separator
			//works with empty and one single value as well
			StringJoiner sj = new StringJoiner(", ");
			sj.add("aplha");
			sj.add("theta");
			sj.add("gamma");
			System.out.println("sj.toString(): " + sj.toString()); //aplha, theta, gamma
			
			StringJoiner sJoiner = new StringJoiner(", ", "{", "}");
			sJoiner.add("aplha");
			sJoiner.add("theta");
			sJoiner.add("gamma");
			System.out.println("sJoiner: " + sJoiner.toString()); //{aplha, theta, gamma}
			
			
			//StringJoiner("], [", "[", "]")
			//"], [" -> between, "[" -> begin, "]" -> ends
			StringJoiner stringJ = new StringJoiner("], [", "[", "]");
			stringJ.add("aplha");
			stringJ.add("theta");
			stringJ.add("gamma");
			System.out.println("theResult: " + stringJ.toString()); //[aplha], [theta], [gamma]
			
			
			//Using the split and match Methods
			String s1 = "apple, apple and orange please";
			String[] parts = s1.split("\\b");
			for(String thePart : parts){
				if(thePart.matches("\\w+")){
					System.out.println(thePart);
				}
			}
			
			/*
			 * References: Java Pattern
			 * To test: https://regex101.com/
			 * */
			
	    } 
}
