class Solution {
    public boolean isSubsequence(String s, String t) {
        char [] ch1 = s.toCharArray();
        char [] ch2 = t.toCharArray();
        int count = 0 , k = 0;
        for(int i=0 ; i<ch1.length ; i++){
            for(int j = k; j<ch2.length ; j++){
                if(ch1[i] == ch2[j]){
                    count++;
                    k=j+1;
                    break;
                }else{
                    continue;
                }
            }
        }
        
        return count == ch1.length ? true : false;
 
    }
}