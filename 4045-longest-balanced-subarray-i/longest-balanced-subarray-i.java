class Solution {
    public int longestBalanced(int[] nums) {
        int maxlen = 0;
        for(int i = 0;i<nums.length;i++) {
            HashSet<Integer> oddnums = new HashSet<>();
            HashSet<Integer> evennums = new HashSet<>();
            for (int j=i;j< nums.length;j++) {
                if (nums[j] % 2 == 0) {
                    evennums.add(nums[j]);
                } else {
                    oddnums.add(nums[j]);
                }
                if (oddnums.size() == evennums.size()) {
                     maxlen = Math.max(maxlen,j-i+1);
                }
            }

        }
        return maxlen;
    }
}