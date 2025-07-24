class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i : nums) {
            int fq = m.getOrDefault(i, 0) + 1;
            m.put(i, fq);
            if (fq > 1) {
                return i;
            }
        }
        return -1;
    }
}