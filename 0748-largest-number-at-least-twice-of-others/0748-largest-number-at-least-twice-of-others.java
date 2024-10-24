class Solution {
    public int dominantIndex(int[] nums) {
        
        int m = 0;
        int maxIndex = -1;
        
        for(int i= 0; i< nums.length; i++){
            if(nums[i] > m){
                m = nums[i];
                maxIndex = i;
            }
        }
         for(int i= 0; i< nums.length; i++) {
             if(m < nums[i]*2 && m != nums[i]){
                 return -1;
             }
         }
        return maxIndex;
    }
}