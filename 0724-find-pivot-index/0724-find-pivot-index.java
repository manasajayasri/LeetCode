class Solution {
    public int pivotIndex(int[] nums) {
        
        int[] sumRight = new int[nums.length];
        int[] sumLeft = new int[nums.length];

        
         sumRight[nums.length - 1] = 0;
         for (int i = nums.length - 2; i >= 0; i--) {
            sumRight[i] = sumRight[i + 1] + nums[i + 1];
        }
        
         sumLeft[0] = 0;
         for (int i = 1; i < nums.length; i++) {
            sumLeft[i] = sumLeft[i - 1] + nums[i - 1];
        }
        
        for(int i = 0; i<nums.length; i++){
            if(sumLeft[i] == sumRight[i]){
                return i;
            } 
        }
        return -1;
    }
}