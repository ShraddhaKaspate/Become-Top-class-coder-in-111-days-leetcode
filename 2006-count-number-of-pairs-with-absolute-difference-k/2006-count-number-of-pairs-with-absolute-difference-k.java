class Solution {
    public int countKDifference(int[] nums, int k) {
        
        int cnt=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                int ans=Math.abs(nums[i] - nums[j]);

                if(ans==k)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}