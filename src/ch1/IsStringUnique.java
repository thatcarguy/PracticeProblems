package ch1;

import java.util.HashSet;
import java.util.Set;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 * @author Zack W
 *
 */
public class IsStringUnique {
	/*
	 * 1. Initial plan would be to use a Set.
	 * 2. However if we cannot use additional data structure, 
	 * 		a. Will use bubble sort since it doesn't use extra memory. 
	 * 		b. Compare the characters at index.  
	 */
	
	/**
	 * Determine if a given String is Unique using additional space. 
	 * Place each character into a HashSet. O(n) extra space.
	 * Runtime is linear O(n) since we are iterating only once over the String. 
	 * @param input String
	 * @return true if no duplicate characters. 
	 */
	private static boolean isUniqueExtraSpace(String input){
		if(input !=null && !"".equals(input)){
			Set<Character> charSet = new HashSet<Character>();
			Character c = null;
			for(int i =0; i< input.length(); i++){
				c= input.charAt(i);
				if(!charSet.add(c)){
					System.out.println("String is not unique: " + c);
					return false;
				}
			}
		}
		System.out.println("String is unique!");
		return true;
	}
	
	/**
	 * Determine if a given String is unique without additional space.
	 * Chose to use BubbleSort since space is O(1). 
	 * Runtime however is O(n^2). 
	 * @param input String
	 * @return isUnique
	 */
	private static boolean isUnique(String input){
		if(input != null && !"".equals(input)){
			for(int i =0; i< input.length()-1; i++){
				for(int j=i+1; j<input.length();j++){
					if(input.charAt(i)==input.charAt(j)){
						System.out.println("String is not unique: " + input.charAt(i));
						return false;
					}
				}
			}
		}
		System.out.println("String is unique!" );
		return true;
	}
	
	public static void main(String[] args){
		String unique = "asdfghjkl";
		String notUnique = "ksdf123456789qwertyuijj";
		//Extra Space
		isUniqueExtraSpace(unique);
		isUniqueExtraSpace(notUnique);
		isUniqueExtraSpace("");
		isUniqueExtraSpace("   s1235g ");
		
		//No Extra Space
		isUnique(unique);
		isUnique(notUnique);
		isUnique("");//Unique
		isUnique("    fg");//Not Unique
		
		
	}
}
