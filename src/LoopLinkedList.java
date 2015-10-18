/**
 * Given a linked list, determine if it has a cycle in it. Follow up: Can you
 * solve it without using extra space?
 * 
 * @author sahiljain
 *
 */
public class LoopLinkedList {

	public boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode slow = head;
		ListNode fast = head.next;

		// move slow node by one unit and fast by two units
		// if there's a cycle in it then they'll meet eventually

		while (slow != null && fast != null && fast.next != null) {

			if (slow == fast) {
				return true;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
	}
}