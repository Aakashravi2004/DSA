class Solution {
    public int longestSubstring(String s, int k) {

        int max = 0;
        int n = s.length();

        for (int uniqueTarget = 1; uniqueTarget <= 26; uniqueTarget++) {
            int[] freq = new int[26];
            int left = 0, right = 0;
            int unique = 0;
            int countAtLeastK = 0;

            while (right < n) {
                if (freq[s.charAt(right) - 'a'] == 0) {
                    unique++;
                }
                freq[s.charAt(right) - 'a']++;

                if (freq[s.charAt(right) - 'a'] == k) {
                    countAtLeastK++;
                }

                right++;

                while (unique > uniqueTarget) {
                    if (freq[s.charAt(left) - 'a'] == k) {
                        countAtLeastK--;
                    }

                    freq[s.charAt(left) - 'a']--;

                    if (freq[s.charAt(left) - 'a'] == 0) {
                        unique--;
                    }

                    left++;
                }

                if (unique == uniqueTarget && unique == countAtLeastK) {
                    max = Math.max(max, right - left);
                }
            }
        }

        return max;

    }

}