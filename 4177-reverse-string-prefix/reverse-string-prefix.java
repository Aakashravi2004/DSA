class Solution {
    public String reversePrefix(String s, int k) {
        if(k == 1)return s;
        int i = 0;
        int j = k-1;
        char [] letters = s.toCharArray();
        while(i < j){
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
            i++;
            j--;
        }
       return new String(letters);
    }
}