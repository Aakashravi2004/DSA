import java.util.Arrays;
class Solution {
    public static boolean isAnagram(String s, String t) {
             int[]a = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        s=s.toLowerCase();
        t=t.toLowerCase();
        for(int i = 0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<t.length();i++){
            a[t.charAt(i)-'a']--;
        }
        for(int i = 0;i<a.length;i++){
            if(a[i] == 0){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}