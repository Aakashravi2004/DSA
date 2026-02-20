class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> storage = new Stack<>();
        for(char para : s.toCharArray()){
            if(para == '['){
                storage.push(para);
            }
            if(para == '{'){
                storage.push(para);
            }
            if(para == '('){
                storage.push(para);
            }
            if(para == ']'){
                if(!storage.isEmpty() && storage.pop() == '['){
                    continue;
                }else{
                    return false;
                }
            }
            if(para == '}'){
                if(!storage.isEmpty() && storage.pop() == '{'){
                    continue;
                }else{
                    return false;
                }
            }
            if(para == ')'){
                if(!storage.isEmpty() &&storage.pop() == '('){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return storage.isEmpty()?true:false;

    }
}