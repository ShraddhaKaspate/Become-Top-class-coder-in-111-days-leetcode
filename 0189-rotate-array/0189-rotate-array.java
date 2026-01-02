/*
class Solution {
    public void rotate(int[] nums, int k) {
        

         int n=nums.length;
         k = k % n;
         //Because rotating an array n times gives the same array back, so k % n keeps only the required effective rotations.

         for(int s=1;s<=k;s++){
            // first last we assign last element as temp element 
            int temp=nums[n-1];
            //put i and j pointers from right side always put i & j in pair ie. j=i-1
            int i=n-1;
            int j=i-1;

            while(j>=0){
                nums[i]=nums[j]; 
                j--;   
                i--;
            }
            nums[0]=temp;   // assign that temp ele to first ele
         }
    }
}
*/

class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;          // remove extra rotations
        if (k == 0) return;

        // reverse whole array
        reverse(nums, 0, n - 1);

        // reverse first k elements
        reverse(nums, 0, k - 1);

        // reverse remaining elements
        reverse(nums, k, n - 1);
    }

    void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}

