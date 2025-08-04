class Solution
 {
    public int subarraySum(int[] nums, int k)
    {
        int cnt=0;

        HashMap<Integer,Integer> map=new HashMap<>();

        int prefixsum[]=new int[nums.length];

        prefixsum[0]=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            prefixsum[i]=prefixsum[i-1]+nums[i];
        }
        
        map.put(0,1);

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(prefixsum[i]-k))
            {
                cnt=cnt+map.get(prefixsum[i]-k);
            }
            map.put(prefixsum[i],map.getOrDefault(prefixsum[i],0)+1);
        }
        return cnt;
    }
}