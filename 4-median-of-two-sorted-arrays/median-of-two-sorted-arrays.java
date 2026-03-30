class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //merge the sorted  two array
        int n1 = nums1.length , n2 = nums2.length;
        int n = n1 + n2;
        int first = 0 , second = 0 , x = 0;
        int [] merged = new int[n1+n2];
        while(first < n1 && second < n2){
            if(nums1[first] < nums2[second]){
                merged[x] = nums1[first];
                first++;
            }else{
                merged[x] = nums2[second];
                second++;
            }
            x++;
        }
        if(first < n1){
            while(first < n1){
                merged[x++] = nums1[first++];
            }
        }
        if(second < n2){
            while(second < n2){
                merged[x++] = nums2[second++];
            }
        }
        // find the median
        int median = merged.length / 2;
        if(merged.length%2 == 0) {
            return (float) (merged[n/2-1] + merged[n/2])/2;
        }
        return (double) merged[median];
    }
}