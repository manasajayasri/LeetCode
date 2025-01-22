class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int found = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count == 0){
                found = nums[i];
            }

            if( nums[i] == found){
                count++;
            } else{
                count--;
            }
        }
        return found;
    }
}