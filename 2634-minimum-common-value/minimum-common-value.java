class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int ans = -1;
        for(int i=0; i<nums1.length; i++){
            ans = findCommon(nums1[i],nums2);
            if(ans != -1){
                return ans;
            }
        }
        return ans;
    }
    public static int findCommon(int num, int[] nums2){
        int start = 0;
        int end = nums2.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums2[mid]==num){
                return nums2[mid];
            }else if(nums2[mid]<num){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}