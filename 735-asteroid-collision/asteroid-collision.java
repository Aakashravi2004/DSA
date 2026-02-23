class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> temp = new Stack<>();

        for(int astro : asteroids){

            boolean flag = false;

            while(!temp.isEmpty() && astro < 0 && temp.peek() > 0){

                if(Math.abs(astro) > temp.peek()){
                    temp.pop();
                }
                else if(Math.abs(astro) == temp.peek()){
                    temp.pop();
                    flag = true;
                    break;
                }
                else{
                    flag = true;
                    break;
                }

            }
            if(!flag){
                temp.push(astro);
            }
            
        }
        int [] result = new int[temp.size()];
        for(int i = temp.size()-1 ; i>=0 ; i--){
            result[i] = temp.pop();
        }
        return result;
        
    }
}