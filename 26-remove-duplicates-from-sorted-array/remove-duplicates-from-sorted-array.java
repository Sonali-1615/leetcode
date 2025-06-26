class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new TreeSet<>();
        for(int i : nums) {
            s.add(i);
        }
        int n = s.size();
        int j = 0;
        for(int val : s) {
            nums[j++] = val;
        }
        return n;
    }
}