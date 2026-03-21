class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
       HashMap<Integer,Integer> Freqence = new HashMap<>();
        for(int num : nums){
            if(Freqence.containsKey(num)){
                Freqence.put(num,Freqence.getOrDefault(num,0)+1);

            }else {
                Freqence.put(num,1);
            }
        }

       Map<Integer,List<Integer>> reverseFrequence = new HashMap<>();

       for(int num : Freqence.keySet()){
           int count = Freqence.get(num);
           if(!reverseFrequence.containsKey(count)){
               reverseFrequence.put(count,new ArrayList<>());
           }reverseFrequence.get(count).add(num);

       }

       int [] res = new int[k];
       int index = 0;
       for (int i = nums.length ; i>=1 ; i--){
           if(reverseFrequence.containsKey(i)){
               for (int n : reverseFrequence.get(i)){
                   if(index < k){
                       res[index++] = n;
                   }else{
                       break;
                   }
               }
           }
           if(index >= k){
               break;
           }
       }
    return res;
    }
}