class Solution {
    public int maximumLengthSubstring(String s) {

        int [] sFreq = new int[26];
        int left=0 , maxLen = 0;

        for(int right = 0 ; right < s.length() ; right++){
            char c = s.charAt(right);
            sFreq[c-'a']++;

            while(sFreq[c-'a'] > 2){
                sFreq[s.charAt(left) - 'a']--;
                left++;
            }

            maxLen = Math.max(maxLen,right - left + 1);
        } 

        return maxLen;

    }

}