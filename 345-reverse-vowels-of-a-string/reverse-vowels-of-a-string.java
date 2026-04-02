class Solution {
    public String reverseVowels(String s) {
        int high = 0;
		int low = s.length()-1;
		char[]character = s.toCharArray();
		while(high<low) {
			if(!isVowel(character[high])) {
				high++;
			}else if(!isVowel(character[low])) {
				low--;
			}else {
				char temp = character[high];
				character[high] = character[low];
				character[low] = temp;
				high++;
				low--;
			}
		}
		return String.valueOf(character);
        
    }

    public static boolean isVowel(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' 
				|| c == 'I' || c == 'O' || c == 'U') {
			return true;
		}
		return false;
			
	}
	
}