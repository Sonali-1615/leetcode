class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                nums[i] = -1;
            }
        }
        int sum = 0;
        int maxA = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < n; i++){
            sum += nums[i]; 
            if(map.containsKey(sum)) {
                int last = map.get(sum);
                maxA = Math.max(maxA, i - last);
            } else {
                map.put(sum, i);
            }
        }
        return maxA;
    }
}