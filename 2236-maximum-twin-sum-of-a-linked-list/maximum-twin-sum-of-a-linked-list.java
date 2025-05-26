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
        ListNode cur = head;
        while(cur != null) {
            s.push(cur.val);
            cur = cur.next;
        }
        cur = head;
        int maxsum = 0;
        int n = s.size();
        for(int i = 0; i < n / 2; i++) {
            int top = s.pop();
            maxsum = Math.max(maxsum, cur.val + top);
            cur = cur.next;
        }
        return maxsum;
    }
}