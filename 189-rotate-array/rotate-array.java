class Solution {
   public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        if(k<0){
            k = k+n;
        }
        Swap(nums,0 ,n-1);
        Swap(nums,0,k-1);
        Swap(nums,k,n-1);
    }

    public static void Swap(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}