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
			if(isVowel(arr[i]))
				sb.append(arr[i]);
		}
		
		int j =0;
		for(int i=0; i<arr.length; i++) {
			if(isVowel(arr[i]))
			{
				arr[i] = sb.charAt(j);
				j++;
			}
		}
		
		return new String(arr);
		
	}
	
	public static void main(String[] args) {
		String str = "ssdhanashetti";
		System.out.println(reverseVowel(str));
		System.out.println(reverseVowel(str).equals(reverseVowels1(str)));
	}
	
	//Better approach
	static String reverseVowel(String str) {
		// Start two indexes from two corners
		// and move toward each other
		int i = 0;
		int j = str.length()-1;
		char[] str1 = str.toCharArray();
		while (i < j)
		{
			if (!isVowel(str1[i]))
			{
				i++;
				continue;
			}
			if (!isVowel(str1[j]))
			{
				j--;
				continue;
			}

			// swapping
			char t = str1[i];
			str1[i]= str1[j];
			str1[j]= t;
			

			i++;
			j--;
		}
		String str2 = String.copyValueOf(str1);
		return str2;
	}
	
	// utility function to check for vowel
		static boolean isVowel(char c) {
			return (c == 'a' || c == 'A' || c == 'e'
					|| c == 'E' || c == 'i' || c == 'I'
					|| c == 'o' || c == 'O' || c == 'u'
					|| c == 'U');
		}

}
