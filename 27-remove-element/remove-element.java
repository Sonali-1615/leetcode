class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : nums) {
            if(i != val) {
                al.add(i);
            }
        }
        int n = al.size();
        int j = 0;
        for(int i : al) {
            nums[j++] = i;
        }
        return n;
    }
}