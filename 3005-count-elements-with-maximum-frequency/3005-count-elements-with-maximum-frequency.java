class Solution {
    public int maxFrequencyElements(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(int j: map.values()){
            if(j>ans)
            {
                ans=j;
            }
        }

        for (int j : map.values()){
            if(j==ans){
                cnt+=j;
            }
        }
        return cnt;
    }
}