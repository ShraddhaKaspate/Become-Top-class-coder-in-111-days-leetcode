class Solution {
    public int majorityElement(int[] nums) 
    {
        /*
        int count = 0;
        int candidate = 0;

        for (int i : nums) {
            if (count == 0) {
                candidate = i;
            }

            if (i == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
        */

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int key: map.keySet()){
            if(map.get(key)>nums.length/2){
                return key;
            }
        }
        return -1;
    }
}