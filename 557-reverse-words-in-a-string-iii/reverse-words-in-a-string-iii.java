class Solution {
    public String reverseWords(String s) {
        String [] words = s.split(" ");
       StringBuilder ReversedWord = new StringBuilder();
       for(String word : words){
            StringBuilder temp = new StringBuilder(word).reverse();
            ReversedWord.append(temp).append(" ");
       }
       ReversedWord.deleteCharAt(ReversedWord.length()-1);
       return ReversedWord.toString();
    }
}