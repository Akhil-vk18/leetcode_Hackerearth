class Solution:
    def searchInsert(self, nums: list[int], target: int) -> int:



        # if nums[0]>=target :
        #      return 0
        
        # length=len(nums)
        # if nums[-1]<=target:
        #     return length-1

        left  =0 
        right = len(nums)-1
        pos =-1
        while ( left <=right) :

            pos = (left+right)//2

            if(nums[pos]==target):
                return pos
            elif(nums[pos]<target):
                left=pos+1
            else:
                right=pos-1


        return left

        
    