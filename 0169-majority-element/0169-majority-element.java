class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int found = 0;
        for(int i : nums){
            if(count == 0){
                found = i;
            }

            if( i == found){
                count++;
            } else{
                count--;
            }
        }
        return found;
    }
}