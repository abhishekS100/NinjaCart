package Stack;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 } 

public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        } 

        ListNode newHead = reverseList(head.next);

        ListNode headNext = head.next;

        headNext.next = head;

        head.next = null;

        return newHead;
     }
}
