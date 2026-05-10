class Solution {
    public int firstMissingPositive(int[] nums) {

        if(nums.length == 1 && nums[0] == 1)return 2;

        Map<Integer, Boolean> map = new HashMap<>();
        for(int i = 1; i <= nums.length; i++){
            map.put(i, false);
        }

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, true);
            }
        }

        for(int  m : map.keySet()){
            if(!map.get(m)){
                return m;
            }  
        }

        return nums.length+1;
    }
}