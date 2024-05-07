
//https://leetcode.com/problems/linked-list-cycle/description/

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(slow == fast)
                    return true;
            }
            return false;

    }
}
