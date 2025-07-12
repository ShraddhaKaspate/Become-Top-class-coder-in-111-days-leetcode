class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // Pointer for placement

                        for (int num : nums) {
                                    // If i < 2, we can always add the number
                                                // If num != nums[i-2], it means this is not the 3rd+ duplicate
                                                            if (i < 2 || num > nums[i - 2]) {
                                                                            nums[i] = num;
                                                                                            i++;
                                                                                                        }
                                                                                                                }

                                                                                                                        return i; // New length of the array
    }
}