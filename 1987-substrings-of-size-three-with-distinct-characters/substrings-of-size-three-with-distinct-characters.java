class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length() < 3){
            return 0;
        }

        int n = s.length() , count = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0;i <= n-3; i++) {
            hs = new HashSet<>();
            for (int j = i; j <= (i + 3) - 1; j++) {
                hs.add(s.charAt(j));
            }
            if(hs.size() == 3){
                count++;
            }
        }
        return count;
    }
}