package basic.programs;

/*
 * Given a string, remove the vowels from the string.
 */
public class RemoveVowelsFromString {
	
    String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < S.length(); i++)
        {
            if(!isVowel(S.charAt(i)))
                sb.append(S.charAt(i));
        }
        return sb.toString();
    }
    
    private boolean isVowel(char c)
    {
        if(c == 'a'|| c == 'e'||c == 'i'|| c == 'o'|| c == 'u')
        return true;
        
        return false;
    }


}
