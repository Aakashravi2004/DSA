class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        int longestLength = 0;

        for(int num : hs){
            if(!hs.contains(num-1)){
                int currNumber = num;
                int count = 1;
                while(hs.contains(currNumber+1)){
                    currNumber++;
                    count++;
                }
                longestLength = Math.max(longestLength,count);
            }
        }

        return longestLength;

    }
}