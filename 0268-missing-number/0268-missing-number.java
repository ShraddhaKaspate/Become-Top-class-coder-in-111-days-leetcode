class Solution {
    public int missingNumber(int[] nums) {
        int cnt=0;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==cnt){
                cnt++;
            }
        }
        return cnt;
    }
}

//Complaxity O(nlogn)