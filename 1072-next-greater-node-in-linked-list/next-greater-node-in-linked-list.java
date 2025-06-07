/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>();
    ListNode cur = head;
    while (cur != null) {
        values.add(cur.val);
        cur = cur.next;
    }
    int[] res = new int[values.size()];
    for (int i = 0; i < values.size(); i++) {
        for (int j = i + 1; j < values.size(); j++) {
            if (values.get(j) > values.get(i)) {
                res[i] = values.get(j);
                break;
            }
        }
    }
    return res;
    }
}