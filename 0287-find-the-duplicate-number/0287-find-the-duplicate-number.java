class Solution {
    public int findDuplicate(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);

                if(map.get(nums[i])==2)
                     return nums[i];
            }else{
                map.put(nums[i], 1);
            }
        }
    return -1;
    }
}