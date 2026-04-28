class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        //to make our priorityQueue to maxHeap
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0] == b[0])
                    return b[1]-a[1];
                return b[0]-a[0];
            }
        });

        for(int i = 0 ; i<mat.length ; i++){
            maxHeap.add(new int[]{binarySearch(mat[i]), i});
            if(maxHeap.size() > k){
                maxHeap.remove();
            }
        }

        int[] ans = new int[k];
        while(k>0){
            ans[--k] = maxHeap.remove()[1];
        }
        return  ans;
    }
     public static int binarySearch(int[]arr){
        int start = 0 , end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start) / 2;
            if(arr[mid] == 1){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
     }
}