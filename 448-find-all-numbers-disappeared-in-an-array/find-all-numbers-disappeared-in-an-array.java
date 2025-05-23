class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();

        // Mark seen numbers
        boolean[] seen = new boolean[n + 1];
        for (int num : nums) {
            seen[num] = true;
        }

        // Collect missing numbers
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                l.add(i);
            }
        }

        return l;
    }
}
