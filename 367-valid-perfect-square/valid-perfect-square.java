class Solution {
    public boolean isPerfectSquare(int num) {

        long oddnum = 1;
        long sum = oddnum;

        while(sum <= num){
            if(sum == num){
                return true;
            }
            oddnum += 2;
            sum += oddnum;
        }
        return false;       
    }
}