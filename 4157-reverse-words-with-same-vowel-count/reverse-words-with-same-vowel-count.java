class Solution {
    public String reverseWords(String s) {
        String [] words = s.split(" ");
		String findCount = words[0];
		int countVowels = FindVowelCount(findCount);
		
		for(int i = 1; i < words.length ; i++) {
			if(FindVowelCount(words[i]) == countVowels) {
				words[i] = isReverse(words[i]);
			}
		}
		return String.join(" ", words);
    }

    public static String isReverse(String s) {
		char [] a = s.toCharArray();
		int start = 0;
		int end = s.length()-1;
		while(start < end) {
			char temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return String.valueOf(a);
	}
	
	
	public static int FindVowelCount(String s) {
		int count  =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
		
	}
}