class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        k=0
        max=0
        for num in nums:
            if num !=0:
                k=k+1
            else:
                if k>=max:
                    max=k
                k=0
        if k>=max:
            max=k
        return max