package ch1;
/**
 * Given two Strings, write a method to decide if one is a permutation of the other. 
 * @author Zack W
 *
 */
public class CheckPermutation {
	/*
	 * 1. Determine which String of the two Strings is larger. 
	 * 2. Loop through larger String compare with the smaller. 
	 */
	/**
	 * 
	 * @param String a
	 * @param String b
	 * @return true if a is a permutation of b
	 */
	private static boolean isPermutationNoExtraSpace(String a, String b){
		boolean canProceed = canProceed(a, b);
		boolean isPermutation = false;
		if(!canProceed){
			return false;
		}
		for(int i =0; i < b.length(); i++){
			if(b.charAt(i) == b.charAt(0)){
				if( isPerm(a,b,0,i));
				{
					System.out.println("Is Permutation");
					return true;
				}
			}
		}
		
		System.out.println("Not Permutation");
		return isPermutation;
	}
	private static boolean isPerm(String a, String b, int start, int i){
		while(a.charAt(i)== b.charAt(start)){
			i++;
			start++;
		}
		return start == b.length()-1;
	}
	private static boolean canProceed(String a, String b){
		if(a== null && b== null){
			System.out.println("Please provide non null values!");
			return false;
		}else if(a.equals(b)){
			System.out.println("The two Strings are equals: " + a +" "+ b);
			return false;
		}else if(a.length()>b.length()){
			System.out.println("String A is larger than String B");
			return false;
		}else  
			return true;
	}
	
	public static void main(String[] args){
		String a = "Name";
		String b = "Hello my Name is Duke";
		String c = "Duke";
		isPermutationNoExtraSpace(c, b);
		isPermutationNoExtraSpace(a, b);
		
	}
	
}
