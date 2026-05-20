class Solution {
    public int longestBeautifulSubstring(String word) {
        int maxLen = 0;
        int left = 0;
        int count = 1;
        for(int right = left+1; right < word.length(); right++){

            if(word.charAt(right) < word.charAt(right-1)){
                left = right;
                count = 1;
                continue;
            }
            if(word.charAt(right) != word.charAt(right-1)){
                count++;
            }
            if(count == 5){
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;

    }
}