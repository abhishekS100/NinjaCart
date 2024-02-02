
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }
 
class Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
  
      while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast)
          return true;
      }
  
      return false;
    }
  }