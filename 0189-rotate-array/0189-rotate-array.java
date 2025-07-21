class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // In case k > n
        reverse(nums, 0, n - 1);       // Reverse whole array
        reverse(nums, 0, k - 1);       // Reverse first k elements
        reverse(nums, k, n - 1);       // Reverse remaining n-k elements
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--; // Fixed here
        }
    }
}
