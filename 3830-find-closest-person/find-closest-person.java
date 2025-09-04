class Solution {
    public int findClosest(int x, int y, int z) {
        int m = Math.abs(x - z);
        int n = Math.abs(y - z);
        if(m < n) {
            return 1;
        } else if(m > n) {
            return 2;
        } else {
            return 0;
        }
    }
}