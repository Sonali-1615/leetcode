class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        long cnt = 0;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < n - 3; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < n - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                int k = j + 1;
                int l = n - 1;
                while(k < l) {
                    cnt = (long)nums[i] + nums[j] + nums[k] + nums[l];
                    if(cnt == target) {
                       res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                       k++;
                       l--;
                       while(k < l && nums[k] == nums[k - 1]) k++;
                       while(k < l && nums[l] == nums[l + 1]) l--;
                    } else if(cnt < target) k++;
                    else l--;
                }
            }
        }
        return res;
    }
}