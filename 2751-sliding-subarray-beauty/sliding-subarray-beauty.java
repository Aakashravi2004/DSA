class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {

       int n = nums.length;
		int [] Beauty = new int[n-k+1];
		
		int [] frequency = new int [101];
		
		for(int i=0 ; i<k ; i++) {
			int val = nums[i];
			frequency[val+50]++;
		}
		
		for(int i=0 ; i <= n-k ; i++) {
			int count = 0;
			int beauty = 0;
			
			for(int j = 0;j<50;j++) {
				count += frequency[j];
				if(count >= x) {
					beauty = j-50;
					break;
				}
			}
			Beauty[i] = beauty;
			
			if(i + k < n) {
				frequency[nums[i] +50]--;
				frequency[nums[i+k]+50]++;
			}
			
		}
		return Beauty; 
       
    }
}