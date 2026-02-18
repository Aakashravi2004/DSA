class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> al = new ArrayList<>();
        Map<Integer,Integer> hs = new HashMap<>();

        for(int i : nums1){
            hs.put(i,hs.getOrDefault(i,0)+1);
        }

        for(int i : nums2){
            if(hs.containsKey(i) && hs.get(i) > 0){
                al.add(i);
                hs.put(i,hs.get(i)-1);
            }
        }
  
        int [] a = new int[al.size()];
        int index = 0;
        for(int i : al){
           a[index++] = i;
        }
        return a;
    }
}