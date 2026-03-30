class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n=nums.length;
        int pos[]=new int[n/2];
        int neg[]=new int[n/2];

        int p=0,ng=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                pos[p]=nums[i];
                p++;
            }else{
                neg[ng]=nums[i];
                ng++;
            }
        }

        int ans[]=new int[n];
        int j=0;
        for(int i=0;i<n/2;i++){
            ans[j]=pos[i];
            j++;
            ans[j]=neg[i];
            j++;
        }
        return ans;
    }
}