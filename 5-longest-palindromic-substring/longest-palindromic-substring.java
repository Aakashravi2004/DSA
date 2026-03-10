class Solution {
    public String longestPalindrome(String s) {

        if(s.length() <= 1)
            return s;

        String longPalin = "";

        for(int i=1;i<s.length();i++){

            //Odd palindrome
            int low = i;
            int high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length())
                    break;

            }
            String temp = s.substring(low+1,high);
            if(temp.length() > longPalin.length()){
                longPalin = temp;
            }

            //Even palindrome
            low = i-1;
            high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length())
                    break;
            }
            temp = s.substring(low+1,high);
            if(temp.length() > longPalin.length()){
                longPalin = temp;
            }
        }
        return longPalin;  
        
    }
}