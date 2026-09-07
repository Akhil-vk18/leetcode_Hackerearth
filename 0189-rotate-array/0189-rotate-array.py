class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        length=len(nums)
        # print(length)
        arr=[0]*length
        # print(arr)
       
        for i in range(length):
            # print("loop variable :" ,i)
            # print(f"arr[{i}]:",arr[i])
            arr[(i+k)%length]=nums[i]
            # print(f"arr[{(i+k)%length}]: after :",arr[(i+k)%length])

        # print(arr)
        nums[:]=arr
        # print(nums)
        