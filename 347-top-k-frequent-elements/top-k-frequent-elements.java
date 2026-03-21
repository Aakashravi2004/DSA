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
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(Freqence.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        List<Map.Entry<Integer, Integer>> list1 = new ArrayList<>(sortedMap.entrySet());

        int[] finalArray = new int[k];

        for (int i = 0; i < k; i++) {
            finalArray[i] = list1.get(i).getKey();
        }

       return finalArray;
    }
}