
import java.util.*;


public class Linked_List_Cycle_II {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();

        while (head != null) {
            if (set.contains(head)) {
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
}