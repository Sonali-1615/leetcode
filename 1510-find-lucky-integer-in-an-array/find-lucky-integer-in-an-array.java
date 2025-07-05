class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> fmap = new HashMap<>();
        for(int num : arr) {
            fmap.put(num, fmap.getOrDefault(num, 0) + 1);
        }
        int result = -1;
        for(Map.Entry<Integer, Integer> entry : fmap.entrySet()) {
            int value = entry.getKey();
            int freq = entry.getValue();
            if(value == freq) {
                result = Math.max(result, value);
            }
        }
        return result;
    }
}