class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> li = new ArrayList<>();

        for(int i = 0;i<str.length;i++){
            if(str[i].equals("-1")){
                continue;
            }
            List<String> temp = new ArrayList<>();
            for(int j = i+1;j<str.length;j++){

                if(str[j].equals("-1"))
                    continue;
                boolean flag = checkAnagram(str[i],str[j]);

                if(flag){
                    temp.add(str[j]);
                    str[j] = "-1";
                }
            }
            temp.add(str[i]);
            li.add(temp);
        }

        return  li;
    
    }

    public static  boolean checkAnagram(String s,String t){

        //Edgecase
        if(s.length()!=t.length()){
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
     }
}