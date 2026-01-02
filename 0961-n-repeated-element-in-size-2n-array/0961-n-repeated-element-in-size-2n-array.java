class Solution {
    public int repeatedNTimes(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int mostreapeaded=-1;

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                mostreapeaded=nums[i];
                break;
            }
            map.put(nums[i],1);

            }
            return mostreapeaded;
        }
    
}