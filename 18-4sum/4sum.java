class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;

            for (int j = i + 1; j < n; j++) {
                if(j != (i+1) && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int z = n-1;

                while (k<z){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[z];

                    if(sum == target){
                        List<Integer> li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        li.add(nums[z]);

                        ans.add(li);

                        k++;
                        z--;

                        while(k<z && nums[k] == nums[k-1]) k++;
                        while(k<z && nums[z] == nums[z+1]) z--;

                    } else if (sum < target) {
                        k++;
                    }else {
                        z--;
                    }
                }
            }
        }
        return ans;
        
    }
}