class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> MinHeap = new PriorityQueue<Integer>();
		
		for(int num : nums) {
			MinHeap.add(num);
			
			if(MinHeap.size() > k) {
				MinHeap.poll();
			}
			
		}
		return MinHeap.peek();

    }
}