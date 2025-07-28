class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int arr[]=new int[nums.length];
        int pos = nums.length - 1;
        while(i<=j){
            int squareleft=nums[i]*nums[i];
            int squareright=nums[j]*nums[j];
            
            if (squareleft > squareright){
                arr[pos] = squareleft;
                i++;
            }else {
                arr[pos] = squareright;
                j--; 
            }
            pos--;
        }

         return arr;
    }
}