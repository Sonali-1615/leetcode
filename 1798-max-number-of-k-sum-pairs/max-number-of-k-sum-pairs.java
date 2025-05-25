class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int suf = n - 1;
        int pref = 0;
        int ans = 0;
            while(pref < suf) {
                int sum = nums[pref] + nums[suf];
                if(sum == k) {
                    ans++;
                    pref++;
                    suf--;
                }
                else if(sum > k) {
                    suf--;
                }
                else {
                    pref++;
                }
            }
            return ans;
    }
}