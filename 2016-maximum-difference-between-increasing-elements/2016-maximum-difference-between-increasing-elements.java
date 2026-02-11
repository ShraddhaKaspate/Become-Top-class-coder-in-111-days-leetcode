class Solution {
    public int maximumDifference(int[] nums)
    {
       int min=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++)
       {
        for(int j=0;j<i;j++)
        {

            if(nums[i]-nums[j]>=min)
            {
                min=nums[i]-nums[j];
               
            }
        }
        
       } 
      if(min>0){
        return min;

      }else{
        return -1;
      }
    }
}