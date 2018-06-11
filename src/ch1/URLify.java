package ch1;
/**
 * Write a method to replace all spaces in a String with %20. 
 * Assume that their is sufficient space at the end of the array. 
 * @author Zack W
 *
 */
public class URLify {
	private static final char[] URL = {'%','2','0'};
	
	private static void replaceWhiteSpace(char[] arr, int length){
		for(int i =0; i<length; i++){
			if(arr[i]== ' '){
				shift(arr, i);
				insert(arr,i);
				i = i+2;
			}
		}
		
	}
	/*
	 * After the shift, we will insert the URL characters into the array at the given index.
	 */
	private static void insert(char[] arr, int index){
		for(int i =0;i< URL.length; i++ ){
			arr[index++]=URL[i];
		}
		printArr("Insert",arr);
	}
	/*
	 * Shifted the array starting from the end by 2.
	 */
	private static void shift(char[] arr, int index){
		for(int i = arr.length-1; i>index+2; i--){
			arr[i] = arr[i-2];
		}
		printArr("Shift",arr);
	}
	
	static void printArr(String msg, char[] arr){
		System.out.println(msg);
		for(char a: arr){
			System.out.print(a+ " ");
		}
		
	}
	public static void main(String[] args){
		String a = "Mr John Smith    ";
		String b = " Dog  ";
		replaceWhiteSpace(a.toCharArray(), a.length());
		replaceWhiteSpace(b.toCharArray(), b.length());
	}
	
}
