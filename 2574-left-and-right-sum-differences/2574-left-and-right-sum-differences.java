class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] finalResult = new int[nums.length];
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }
        int leftSum = 0;
        for(int i=0 ; i<nums.length; i++){
            int rightSum = totalSum - leftSum - nums[i];
            
            finalResult[i] = Math.abs(leftSum - rightSum);

            leftSum += nums[i];
        }
        return finalResult;
    }
}