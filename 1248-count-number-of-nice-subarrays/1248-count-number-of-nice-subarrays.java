class Solution {
    public static int numberOfSubarrays(int [] nums, int k){
        return atMost(nums,k) - atMost(nums,k-1);
    }

    public static int atMost(int[] nums, int k) {
        int count = 0;
        int left = 0;
        int oddCount = 0;
        for (int right = left; right < nums.length; right++) {
            if (nums[right] % 2 != 0) {
                oddCount++;
            }
            while (oddCount > k) {
               if(nums[left] % 2 != 0) {
                    oddCount--;
               }
               left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
}