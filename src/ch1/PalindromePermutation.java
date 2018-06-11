package ch1;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Check to see if the given String is a permutation of a palindrome.
 * @author Zack W
 *
 */
public class PalindromePermutation {
	
	/**
	 * Method will determine if a given String is permutation of Palindrome.
	 * Put all characters into hashmap and count their occurence with helper method.
	 * This solution uses O(n) extra space with the HashMap. 
	 * It will be linear O(n) for run time complexity since we are only iterating twice.   
	 * @param String input
	 */
	protected static void palindrome(String input){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i< input.length(); i++){
			Character c = input.charAt(i);
			if(map.containsKey(c)){
				Integer temp = map.get(c);
				temp = temp+1;
				map.put(c,temp);
			}else{
				map.put(c, new Integer(1));
			}
		}
		boolean isGood = checkMap(map);
		String message = (isGood)? " Is a perm palindrome":" Is not Perm Palindfrom";
		System.out.println(input + message);
	}
	/**
	 * Determine if a Hashmap has at most one odd number character in it. 
	 * @param charMap
	 * @return true if no more than one odd character count. 
	 */
	private static boolean checkMap(HashMap<Character, Integer> charMap){
		int oddCount = 0;
		
		for(Entry<Character, Integer> entry : charMap.entrySet()){
			if(entry.getValue()%2 != 0 && entry.getKey()!=' '  ){
				oddCount++;
				if(oddCount > 1){
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args){
		String a = "taco cat";
		String b = "racecar";
		palindrome(a);
		palindrome(b);
	}
	
}
