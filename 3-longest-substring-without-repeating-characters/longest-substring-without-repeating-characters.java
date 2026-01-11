class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> hs = new HashSet<>();
        int max = 0;
        int start = 0;
        int end = 0;
       while(end < s.length()){
            if(!hs.contains(s.charAt(end))){
                hs.add(s.charAt(end));
                end++;
                max = Math.max(max,hs.size());
            }else{
                hs.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
       }
       return max;
    }
}