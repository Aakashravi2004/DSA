class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = Integer.MIN_VALUE;
        for(int[] acc : accounts){
            int Sum = 0;
            for(int ac : acc){
                Sum += ac;
            }
            if(Sum > result) result = Sum;
        }
        return result;

    }
}