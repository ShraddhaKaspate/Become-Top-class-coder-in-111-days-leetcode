class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int ind=nums.length;
        while(start<=end){

            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                
                 return mid;

            }else if(nums[mid]>target){

                ind=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ind;
    }
}