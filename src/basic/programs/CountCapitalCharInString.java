package basic.programs;

public class CountCapitalCharInString {
	
	public static int countofCapitalLetters(String str)
	{
		int count =0;
		for(int i = 0; i<str.length(); i++)
		{
			
			if(Character.isUpperCase(str.charAt(i)))
				count++;
		}
		return count;
	}
	//another way
	public static int countCamelCase (String s)
    {
    	int res = 0;
    	for (int i = 0; i < s.length (); ++i)
    		if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
    			res++;
    
    	return res;
    }
	
	public static void main(String[] args) {
		System.out.println(countCamelCase("ShankarRajSD"));
	}

}
