package basic.programs;

/**
 * 
 * @author Shankar Raj
 * 
 * Reversing the vowels in a string
 *
 */
public class ReverseVowelsInString {
	
	private static String reverseVowels1(String s)
	{
		StringBuilder sb = new StringBuilder();
		char[] arr = s.toCharArray();
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i] == 'a' ||arr[i] == 'e' ||arr[i] == 'i' ||arr[i] == 'o' ||arr[i] == 'u')
				sb.append(arr[i]);
		}
		
		int j =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 'a' ||arr[i] == 'e' ||arr[i] == 'i' ||arr[i] == 'o' ||arr[i] == 'u')
			{
				arr[i] = sb.charAt(j);
				j++;
			}
		}
		
		return new String(arr);
		
	}
	
	public static void main(String[] args) {
		String str = "ssdhanashetti";
		System.out.println(reverseVowels1(str));
	}

}
