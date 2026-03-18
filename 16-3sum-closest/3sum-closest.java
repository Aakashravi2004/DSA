class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int Result = nums[0] + nums[1] + nums[2];
        int minDifference = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == target) return target;
                else if (sum < target) {
                    j++;
                }else {
                    k--;
                }
                int diffToTarget =  Math.abs(sum-target);
                if(diffToTarget < minDifference){
                    Result = sum;
                    minDifference = diffToTarget;
                }

            }
        }
        return Result;       

    }
}