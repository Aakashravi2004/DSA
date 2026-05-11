class Solution {
    public String longestNiceSubstring(String s) {
        String result = "";
        for(int i=0; i<=s.length()-1; i++){
            for(int j=i; j<=s.length()-1; j++){
                String sub = s.substring(i,j+1);
                if(ifNicest(sub)){
                    if(sub.length() > result.length()){
                        result = sub;
                    }
                }
            }
        }
        return result;
    }

    public static boolean ifNicest(String s){
        int [] ch = new int[128];
        for(char c : s.toCharArray()){
            ch[c]++;
        }
        for(int i = 0 ; i<=s.length()-1; i++){
            if(Character.isUpperCase(s.charAt(i))){
                if(ch[s.charAt(i)+32]==0) return false;
            }else{
                if(ch[s.charAt(i)-32]==0) return false;
            }
        }
        return true;
    }


}
