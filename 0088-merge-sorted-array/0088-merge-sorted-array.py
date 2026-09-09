class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
      
        i=0
        j=0
        k=0
        temp =[0]*(m+n)
        while i<m and j <n:

            if nums1[i] >nums2[j] :
                temp[k]=nums2[j]
                j=j+1

            else:
                temp[k]=nums1[i]
                i=i+1

            # print(k)
            k=k+1

        while i<m :
            # print(k)
            temp[k]=nums1[i]
            i=i+1
            k=k+1

        while j<n :
            # print(k)
            temp[k]=nums2[j]
            j=j+1
            k=k+1
        # print(temp)

        nums1[:]=temp
