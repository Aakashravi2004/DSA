class Solution {
    public boolean isPerfectSquare(int num) {

        if(num < 0){
            return false;
        }
        if(num == 0 || num==1){
            return true;
        }

       long low = 1;
       long high = num;

       while(low <= high){
        long mid = low+(high-low)/2;
        long squre = mid*mid;
        if(squre == num){
            return true;
        }else if(squre < num){
            low = mid+1;
        }else { 
            high = mid-1;
        }

       }
       return false;
    }
}