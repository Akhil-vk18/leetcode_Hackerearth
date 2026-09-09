class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        k =0
        i=0
        arr = [0]*len(nums)

        for num in nums:
            if num!=val:
                k +=1
                
                arr[i]=num
                i= i+1

        nums[:]=arr

        return k