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
    public ListNode mergeNodes(ListNode head) {
        ListNode cur = head;
        int sum = 0;
        Stack<Integer> st = new Stack<>();
        while(cur != null) {
            if(cur.val != 0) {
                sum += cur.val;
            } else {
                if(sum != 0) {
                    st.push(sum);
                    sum = 0;
                }
            }
            cur = cur.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(!st.isEmpty()) {
            tail.next = new ListNode(st.remove(0));
            tail = tail.next;
        }
        return dummy.next;
    }
}