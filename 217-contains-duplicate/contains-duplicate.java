class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hset = new HashSet<>();
        for(int num : nums) {
            hset.add(num);
        }
        if(n > hset.size()) {
            return true;
        }
        return false;
    }
}