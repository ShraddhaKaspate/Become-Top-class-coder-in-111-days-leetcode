class Solution {
    public int maxSubArray(int[] nums) {
        /*
        int largets=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                     
                     sum+=nums[k];
                     if(sum>largets){
                        largets=sum;
                     }
                }
            }
        }
        return largets;
        */
/*
         int largets=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                
                     sum+=nums[j];
                     if(sum>largets){
                        largets=sum;
                     }
            }
        }
        return largets;
        */

        int maxsum=Integer.MIN_VALUE;
        int curr=Integer.MIN_VALUE;

        maxsum=nums[0];
        curr=nums[0];

        for(int i=1;i<nums.length;i++){

            curr=Math.max(nums[i],curr+nums[i]);
            maxsum=Math.max(maxsum,curr);

        }
        return maxsum;
    }
}