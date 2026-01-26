class Solution {
    public int countKDifference(int[] nums, int k) {
        /*
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
        */

        HashMap<Integer,Integer>map =new HashMap<>();
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){

            if(map.containsKey(-k+nums[i])){
                cnt+=map.get(-k+nums[i]);
            }

            if (map.containsKey(nums[i] + k)) {
                cnt += map.get(nums[i] + k);
            }
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return cnt;
    }
}