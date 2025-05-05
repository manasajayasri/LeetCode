class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        
        ordered_nums = sorted(nums)
        n = len(ordered_nums)

        if ordered_nums[0] != 0:
            return 0
            
        for i in range(0,n-1):
            if((ordered_nums[i] + 1) != ordered_nums[i+1]):
                val = ordered_nums[i] + 1
                return val
        return ordered_nums[-1] + 1
                
            
        