class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int st = 0;
        int maxL = 0;
        for(int en = 0; en < n; en++) {
            while(nums[en] - nums[st] > 1) {
                st++;
            }
            if(nums[en] - nums[st] == 1) {
                maxL = Math.max(maxL, en - st + 1);
            }
        }
        return maxL;
    }
}