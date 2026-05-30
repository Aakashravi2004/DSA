class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            int leftSum = 0;
            int rightSum = 0;
            for(int j=0; j<i; j++){
                leftSum += nums[j];
            }
            for(int z=i+1; z<n; z++){
                rightSum += nums[z];
            }
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}