package ch1;
/**
 * Given two Strings determine if they are one or zero edits away. 
 * Where an edit is either an insert, deletion, or replacement.
 * @author Zack W
 *
 */
public class OneAway {
	/**
	 * Determine if the two Strings are one edit away from each other. 
	 * 
	 * @param String a
	 * @param String b
	 * @return true if equal or one edit away.
	 */
	protected static boolean oneAway(String a, String b){
		double lengthCheck = Math.abs(a.length()-b.length());
		if(lengthCheck >1){
			return false;
		}
		if(a.length() == b.length()){
			return replacementCheck(a, b);
		}
		String shorter = (a.length()<b.length())? a:b;
		String longer = (shorter.equals(a))? b:a;
		int diffCount =0;
		int j =longer.length()-1;
		for(int i =shorter.length()-1; i>=0; i--){
			if(diffCount >1){
				System.out.println("This was false");
				return false;
			}
			if(longer.charAt(j)!=shorter.charAt(i)){
				diffCount++;
				i++;
			}
			j--;
		}
		System.out.println("This was true");
		return true;
	}
	/**
	 * Determine if at most one char difference between the Strings.
	 * @param String a
	 * @param String b
	 * @return true if at most one difference.
	 */
	private static boolean replacementCheck(String a, String b){
		int diffCount = 0;
		for(int i =0; i< a.length();i++){
			if(a.charAt(i)!= b.charAt(i)){
				diffCount++;
			}
		}
		System.out.println("Diff Count was: " + diffCount);
		return diffCount>1;
	}
	
	public static void main(String[] args){
		String a = "pale";
		String b = "ple";
		oneAway(a,b);//true
		a= "pales";
		b= "pale";
		oneAway(a,b);//true
		a="pale";
		b="bale";
		oneAway(a,b);//true
		a="bake";
		b="pale";
		oneAway(a,b);//false
	}
}
