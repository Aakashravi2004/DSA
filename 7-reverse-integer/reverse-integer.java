class Solution {
    public int reverse(int x) {
        int a = x;

        x = Math.abs(x);
        long  rev=0;
        while(x>0){
            int rem = x%10;
            rev = (rev*10) + rem;
            x=x/10;

            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        if(a < 0)
            return -1*(int)rev;
            

        return (int)rev;
    }
}