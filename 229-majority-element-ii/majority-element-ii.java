class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
            set.add(ele);
        }
        for (int ele : set) {
            if (map.get(ele) > nums.length/3) lst.add(ele);
        }
        return lst;
    }
}