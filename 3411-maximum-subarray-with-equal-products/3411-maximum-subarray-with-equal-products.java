class Solution {
    public int maxLength(int[] nums) {
        int maxLen = 0;
        for(int i=0; i<nums.length; i++){
            int product = 1, lcm = 1, gcd = 0;
            for(int j=i; j<nums.length; j++){
                product *= nums[j];
                gcd = gcd(gcd,nums[j]);
                lcm = lcm(lcm,nums[j]);
                if(product == gcd * lcm){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }

    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
}