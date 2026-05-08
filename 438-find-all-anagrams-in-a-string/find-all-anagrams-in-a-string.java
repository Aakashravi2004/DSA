class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int [] sFreq = new int[26];
        int [] pFreq = new int[26];

        for(char c : p.toCharArray()){
            pFreq[c-'a']++;
        }

        for(int i = 0; i < s.length(); i++){
            sFreq[s.charAt(i)-'a']++;

            if(i >= p.length()){
                sFreq[s.charAt(i - p.length())-'a']--;
            }

            if(Arrays.equals(pFreq, sFreq)){
                ans.add(i - p.length() + 1);
            }

        }
        return ans;
    }
}