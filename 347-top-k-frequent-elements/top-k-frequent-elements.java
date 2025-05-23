class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer> l = new ArrayList<>(map.keySet());;
        l.sort((a, b) -> map.get(b) - map.get(a));
        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = l.get(i);
        }
        return result;
    }
}