package basic.programs;

public class UpperCaseConversion {
	
	public static void main(String[] args) {
		String str = "i love programming";
		System.out.println(caseConvert(str));
				
	}

	private static String caseConvert(String str) {
		char[] charArray = str.toCharArray();
		for(int i=0; i<charArray.length; i++)
		{
			if (i == 0 || charArray[i-1] == ' ') 
				charArray[i] = Character.toUpperCase(charArray[i]);
			
		}
		
		return String.copyValueOf(charArray);
	}

}
