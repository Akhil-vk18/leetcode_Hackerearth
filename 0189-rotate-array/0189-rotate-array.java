class Solution {

    public static void rotate(int[] nums, int k) {
    
    int length =nums.length;
   k=k%length;
     //by reversing 
     
     reverse(nums,0,length-1); //reversing whole array
     reverse(nums,0,k-1);//reversing upto k
     reverse(nums,k,length-1);//reversing from k to end of the array
    }
    public static  void reverse(int[] nums,int start,int end){
        while(start<=end){
            int temp =nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;end--;
        }
    }

}