class Solution {
    public int removeDuplicates(int[] nums) {

        int answer = 0;
        for(int i = 0;i<nums.length;i++){
            int count = 1;
            for(int j=i+1;j<nums.length-answer;j++){
                if(nums[i] == nums[j]){
                    if(count == 2){
                        answer++;
                        int z = j;
                        for(int k=z+1;k<nums.length;k++){
                            nums[z++] = nums[k];
                        }
                        j--;
                        continue;

                    }else{
                        count++;
                        continue;
                    }
                }else{
                    i = j;
                    i--;
                    break;
                }
            }
        }
        return nums.length-answer;
        
    }
}