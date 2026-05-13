class Solution {
    public int maximumLengthSubstring(String s) {
        int result = 0;
        for(int i=0; i<s.length() ; i++){
            for(int j=i; j<s.length(); j++){
                String sub = s.substring(i, j+1);
                if (isValidSub(sub)){
                    if(sub.length() > result){
                        result = sub.length();
                    }
                }
            }
        }
        return result;
    }
    static boolean isValidSub(String s){
        int[] sFreq = new int[26];
        for(int i=0; i<s.length(); i++){
            sFreq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(sFreq[s.charAt(i)-'a']>2){
                return false;
            }
        }
        return true;
    }
}