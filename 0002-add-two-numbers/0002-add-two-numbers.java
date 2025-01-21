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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;

        int carryOver = 0;

        ListNode dummyHead = new ListNode();
        ListNode currentOp = dummyHead;

        while(currentL1 != null || currentL2 != null){
            int l1Value = currentL1 != null ? currentL1.val : 0;
            int l2Value = currentL2 != null ? currentL2.val : 0;

            int sum = l1Value + l2Value + carryOver; 

            carryOver = sum >= 10 ? 1 : 0;

            sum = sum % 10; 

            currentOp.next = new ListNode(sum);
            currentOp = currentOp.next;

            currentL1 = currentL1 != null ? currentL1.next : null;
            currentL2 = currentL2 != null ? currentL2.next : null;
        }

        if( carryOver > 0){
             currentOp.next = new ListNode(carryOver);

        }
        return dummyHead.next;
    }
}