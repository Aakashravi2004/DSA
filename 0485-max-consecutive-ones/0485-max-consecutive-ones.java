class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0; 
        int left = 0;
        for(int right=left; right<nums.length; right++){
            if(nums[left] == 1 && nums[right] == 1){
                maxLen = Math.max(maxLen,right-left+1);
            }else{
                left = right+1;
            }
        }
        return maxLen;
    }
}