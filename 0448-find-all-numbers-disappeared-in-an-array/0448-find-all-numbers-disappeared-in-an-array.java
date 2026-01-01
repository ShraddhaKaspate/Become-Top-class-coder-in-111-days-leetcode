class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
     List<Integer> res=new ArrayList<>();
     boolean pres[]=new boolean[nums.length+1];

     for( int n : nums)
     {
        pres[n]=true;
     }

     for(int i=1;i<=nums.length;i++){
        if(!pres[i]){
            res.add(i);
        }
     }
     return res;
    }
}