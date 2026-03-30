class Solution {
    public int countElements(int[] nums) {

        /*
        Arrays.sort(nums);

        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        int mid=set.size()/2;
        int ans=set.size()-mid;
        return ans;
        */

        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int cnt=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>min && nums[i]<max){
                cnt++;
            }
        }
        return cnt;
    }
}