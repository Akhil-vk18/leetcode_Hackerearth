class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        arr = [0]*len(nums)
        i=0
        for num in nums:
            if num!=0:
                arr[i]=num
                i=i+1
        nums[:]=arr
        