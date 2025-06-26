class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] == target) {
                for(int j = n - 1; j >= 0; j--) {
                    if(nums[j] == target) {
                        return new int[] {i, j};

                    }
                }
            }
        }
        return new int [] {-1, -1};
    }
}