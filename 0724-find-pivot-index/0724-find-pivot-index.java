class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int [] leftSum = new int[n];
        int [] rightSum = new int[n];
        int preFixSum = 0;
        for(int i = 1; i < n; i++){
            preFixSum += nums[i-1];
            leftSum[i] =  preFixSum;
        }
        int suffixSum = 0;
        for(int i = n-2; i >= 0 ; i--){
            suffixSum += nums[i+1];
            rightSum[i] =  suffixSum;
        }
        for(int i = 0 ; i < n ; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }
}