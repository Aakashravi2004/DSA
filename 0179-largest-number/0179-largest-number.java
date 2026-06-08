class Solution {
    public String largestNumber(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if((""+nums[j] + nums[i]).compareTo((""+nums[i] + nums[j])) > 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        String[] numStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = Integer.toString(nums[i]);
        }

        StringBuilder largestNum = new StringBuilder();
        for (String numStr : numStrings) {
            largestNum.append(numStr);
        }

        if (numStrings[0].equals("0")) {
            return "0";
        }

        return largestNum.toString();
    }
}