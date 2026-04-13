class Solution {
    public int[] rearrangeArray(int[] nums) {
        int k[]=new int[nums.length];
        int postive=0;
        int negative=1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                k[postive]=nums[i];
                postive=postive+2;
            }
            else{
                k[negative]=nums[i];
                negative=negative+2;
            }
        }
        return k;
    }
}