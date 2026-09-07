class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
              
        left =0
        length = len(nums)
        for right in range(1,length):
            if (nums[left] != nums[right]):
                left =left +1
                nums[left]=nums[right]
            
        return left+1
                