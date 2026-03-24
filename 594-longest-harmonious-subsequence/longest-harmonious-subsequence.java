class Solution {
    public int findLHS(int[] nums) {
       HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(nums[i])){
                hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
            }else{
                hs.put(nums[i],1);
            }
        }
        int maxLen = 0;
        for(int n : hs.keySet()){
            if(hs.containsKey(n+1)){
                int length = hs.get(n) + hs.get(n+1);
                maxLen = Math.max(maxLen,length);
            }

        }
        return maxLen;

    }
}