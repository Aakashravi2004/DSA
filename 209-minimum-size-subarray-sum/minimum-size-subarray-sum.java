class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int CurrentSum = 0;
        int FinalWindow = Integer.MAX_VALUE;

        for(high = 0; high < nums.length;high++){
            CurrentSum += nums[high];
            while(CurrentSum >= target){
                int tempWindow = high-low+1;
                FinalWindow = Math.min(FinalWindow,tempWindow);
                CurrentSum = CurrentSum - nums[low];
                low++;
            }
        }
        return FinalWindow == Integer.MAX_VALUE ? 0 : FinalWindow;
    }
}