class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int m = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(nums[i] < m) {
                m = nums[i];
            }
        }
        return m;
    }
}