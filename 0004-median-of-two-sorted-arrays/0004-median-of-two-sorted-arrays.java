class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
        int merge[] = new int[nums1.length+nums2.length];
        int i =0,j=0,k=0;
        while (i<nums1.length&&j<nums2.length) {
            if (nums1[i]<=nums2[j]) {
                merge[k++]=nums1[i++];
            }else{
                merge[k++]=nums2[j++];
            }
        }
        while (i<nums1.length) {
            merge[k++]=nums1[i++];
        }
        
        while (j < nums2.length) {
            merge[k++] = nums2[j++];
        }
        int length=merge.length;
        int mid=length/2;
        if (length%2==0) {
            
            return (merge[mid-1]+merge[mid])/2.0;
        }
        else
            return merge[mid];
    }
    
}