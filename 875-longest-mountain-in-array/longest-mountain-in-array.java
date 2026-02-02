class Solution {
    public int longestMountain(int[] arr) {
        int i = 1, m = 0, count = 0;
        while(i < arr.length-1){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                count = 1;
                int j = i;
                while(j > 0 && arr[j] > arr[j-1]){
                    count++;
                    j--;
                }
                j = i;
                while(j < arr.length-1 && arr[j] > arr[j+1]){
                    count++;
                    j++;
                }
                m = Math.max(m,count);
                i = j;
            }else{
                i++;
            }
        }
        return m;
    }
}