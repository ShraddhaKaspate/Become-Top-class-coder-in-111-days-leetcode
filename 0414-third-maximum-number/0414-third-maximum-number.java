class Solution 
{
    public int thirdMax(int[] nums) 
    {
       Arrays.sort(nums);
       int cnt=1;
       int thirdlargest=Integer.MIN_VALUE;
       int largest=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<largest){
                cnt++; 
                largest=nums[i];  
            }
            if(cnt==3){
                return nums[i];
            }                
        }
     return nums[nums.length - 1];
    }
}