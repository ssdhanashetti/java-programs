package basic.programs;

public class ConcatinateAndReverseString {
	
	private static String concatinateAndRevrse(String s1, String s2)
	{
		String concatinatedStr = s1+s2;
		StringBuilder sb = new StringBuilder(concatinatedStr);
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		String str = "Shankar";
		String str2 = "Raj";
		System.out.println(concatinateAndRevrse(str, str2));
		System.out.println(concatinateAndRevrse(str, str2).equals(concatinateAndRevrse2(str, str2)));
	}
	
	private static String concatinateAndRevrse2(String s1, String s2)
	{
		String concatinatedStr = s1+s2;
		StringBuilder sb = new StringBuilder();
		for(int i = concatinatedStr.length()-1; i>=0; i--)
			sb.append(concatinatedStr.charAt(i));
		
		return sb.toString();
	}

}
