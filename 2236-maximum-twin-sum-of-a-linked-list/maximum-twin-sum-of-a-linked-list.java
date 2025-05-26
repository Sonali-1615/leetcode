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
    public int pairSum(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode c = head;
        while(c != null) {
            s.push(c.val);
            c = c.next;
        }
        c = head;
        int m = 0;
        int n = s.size();
        for(int i = 0; i < n / 2; i++) {
            int t = s.pop();
            m = Math.max(m, c.val + t);
            c = c.next;
        }
        return m;
    }
}