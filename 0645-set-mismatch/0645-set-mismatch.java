class Solution {
    public int[] findErrorNums(int[] nums) {
        int len = nums.length;
       int[] op = new int[2];

       java.util.Arrays.sort(nums);
        for(int i = 0; i < len-1; i++){
            if(nums[i] == nums[i+1]){
                op[0] = nums[i];
            }
        }

        //for op[1]:
        for(int i=1; i<=len; i++){
            boolean found = false;
            for(int j : nums){
                if(j == i){
                found = true;
                break;
            }
        }
        if(!found){
            op[1]=i;
            break;
        }
    }
    
    return op;

}
}