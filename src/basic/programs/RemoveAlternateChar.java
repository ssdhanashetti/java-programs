package basic.programs;

import java.util.Arrays;

public class RemoveAlternateChar {
	
	public static String removeAlternateChar(String str) 
	{
		StringBuilder sb = new StringBuilder();
		char[] array = str.toCharArray();
		for(int i=0; i<str.length(); i++)
		{
			if(i %2 == 0) sb.append(array[i]);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(removeAlternateChar("ssdhanashetti"));
	}

}
