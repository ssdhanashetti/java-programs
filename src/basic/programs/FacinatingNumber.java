package basic.programs;

import java.util.Arrays;

public class FacinatingNumber {
	
	private static boolean facinatingNumber(int n)
	{
		String num = n +""+ (n*2)+""+ (n*3);
		char[] charArray = num.toCharArray();
		Arrays.sort(charArray);
		for(int i=0; i<charArray.length; i++)
		{
			if(!Integer.valueOf(charArray[i]-'0').equals(Integer.valueOf(i+1)))
				return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		System.out.println(facinatingNumber(897));
		
	}
}
