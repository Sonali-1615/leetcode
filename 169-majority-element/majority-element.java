class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> fmap = new HashMap<>();
        for(int num : nums) {
            fmap.put(num, fmap.getOrDefault(num, 0) + 1);
            if(fmap.get(num) > n/2) {
               return num;
            }
        }
        return -1;
    }
}