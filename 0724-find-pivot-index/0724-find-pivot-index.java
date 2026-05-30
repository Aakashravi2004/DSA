class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int [] leftSum = new int[n];
        int [] rightSum = new int[n];

        // find all the prefixSum 
        int preFixSum = 0;
        for(int i = 1; i < n; i++){
            preFixSum += nums[i-1];
            leftSum[i] =  preFixSum;
        }

        // find all the suffixSum
        int suffixSum = 0;
        for(int i = n-2; i >= 0 ; i--){
            suffixSum += nums[i+1];
            rightSum[i] =  suffixSum;
        }

        //check the constraint and return
        for(int i = 0 ; i < n ; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }
}