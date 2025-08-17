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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        Stack<ListNode> st = new Stack<>();
        ListNode cur = head;
        while(cur != null) {
            st.push(cur);
            cur = cur.next;
        }
        ListNode newH = st.pop();
        cur = newH;
        while(!st.isEmpty()) {
            cur.next = st.pop();
            cur = cur.next;
        }
        cur.next = null;
        return newH;
    }
}