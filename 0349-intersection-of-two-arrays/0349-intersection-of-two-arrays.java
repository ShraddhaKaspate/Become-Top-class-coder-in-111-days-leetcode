class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> resarray=new HashSet<>();
        for(int ele : nums1){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele : nums2){

            if(map.containsKey(ele)){
                
                resarray.add(ele);
            }
            
        }
        int[] result = new int[resarray.size()];
        int i=0;
        for (int ele : resarray){
            result[i++]=ele;
        }
        
        return result;
       
        
    }
}