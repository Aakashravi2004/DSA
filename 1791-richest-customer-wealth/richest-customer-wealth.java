class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = Integer.MIN_VALUE;
        for(int[] acc : accounts){
            int Sum = 0;
            for(int ac : acc){
                Sum += ac;
                result = Math.max(Sum,result);
            }
        }
        return result;

    }
}