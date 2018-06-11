package ch1;
/**
 * Write a method to do basic String Compression. 
 * Ex. aabcccccaaa => a2b1c5a3
 * 
 * @author Zack W
 *
 */
public class StringCompression {
	
	/**
	 * Compress a String. Ex. aabccc=>a2b1c3
	 * This will run in O(n) time and require O(n) space since we need a StringBuilder. 
	 * @param String  input
	 * @return String The shorter of the new compressed String or original String. 
	 */
	private static String compressString(String input){
		StringBuilder sb = new StringBuilder();
		int count =0;
		int i =0;
		String temp = "";
		while(i<input.length()){
			temp = Character.toString(input.charAt(i));
			count++;
			if(i+1 >= input.length() || input.charAt(i)!= input.charAt(i+1)){
				temp = temp +count;
				sb.append(temp);
				count =0;
			}
			i++;
		}
		return (sb.length()>=input.length())?input:sb.toString();
	}
	public static void main(String[] args){
		String a = "aabcccccaaa";
		System.out.println(compressString(a));//a
		a = "abcdeffa";
		System.out.println(compressString(a));//Original String
		a = "AaBBBBbbCCCCCc";
		System.out.println(compressString(a));
	}
}
