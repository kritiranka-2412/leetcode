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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode temp1 = dummy1;
        ListNode temp2 = dummy2;
        ListNode temp = head;
        while(temp!=null){
            temp1.next = temp;
            temp1 = temp1.next;
            temp = temp.next;
            if(temp!=null){
                temp2.next = temp;
                temp = temp.next;
                temp2 = temp2.next;
            }
        }
        temp2.next = null;
        temp1.next = dummy2.next;
        return dummy1.next;
    }
}