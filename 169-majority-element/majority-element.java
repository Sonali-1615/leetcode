class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int num : nums) {
            int freq = m.getOrDefault(num, 0) + 1;
            m.put(num, freq);
            if(freq > n / 2) {
                ans = num;
            }
        }
        return ans;
    }
}