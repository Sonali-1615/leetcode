class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        List<Integer> l = new ArrayList<>();
        l.add(0);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += gain[i];
            l.add(sum);
        }
        return Collections.max(l);
    }
}
