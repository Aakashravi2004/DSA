class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String [] arr = s.split(" ");
        for(String i : arr){
            sb = sb.append( Reverse(i)+" ");
        }
        String k = sb.toString();
        return k.trim();
    }
    public static String Reverse(String i){
        String temp = "";
        for(int j=i.length()-1;j>=0;j--){
            temp += i.charAt(j);
        }
        return temp;
    }
}