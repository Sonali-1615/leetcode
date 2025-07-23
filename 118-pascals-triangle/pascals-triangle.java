class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            List<Integer> r = new ArrayList<>();
            for(int col = 0; col <= i; col ++) {
                if(col == 0 || col == i) {
                    r.add(1);
                } else {
                    int lp = l.get(i - 1).get(col - 1);
                    int rp = l.get(i - 1).get(col);
                    r.add(lp + rp);
                }
            }
            l.add(r);
        }
        return l;
    }
}