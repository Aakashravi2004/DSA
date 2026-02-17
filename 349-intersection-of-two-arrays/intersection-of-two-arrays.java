class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> arr1 = new HashSet<>();
        HashSet<Integer> arr2 = new HashSet<>();

        for(int i:nums1){
            if(!arr1.contains(i)){
                arr1.add(i);
            }else{
                continue;
            }
        }
        for (int i:nums2){
            if(arr1.contains(i)){
                arr2.add(i);
            }
        }
        int [] ans = new int[arr2.size()];
        int index = 0;
        for(int a : arr2){
            ans[index++] = a;
        }
        return ans;

    }
}