class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
         int Sum = 0 ,MaxSum = 0;

        for(int i = 0;i<k;i++){
            Sum += nums[i];
        }

        MaxSum = Sum;

        int StartIndex = 0;
        int endIndex = k;
        while(endIndex < nums.length){

            Sum -= nums[StartIndex];
            StartIndex++;

            Sum += nums[endIndex];
            endIndex++;

            MaxSum = Math.max(MaxSum,Sum);

        }
        return (double)MaxSum/k;

    }
}