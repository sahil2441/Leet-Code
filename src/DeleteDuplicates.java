/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class DeleteDuplicates {
	public ListNode deleteDuplicates(ListNode head) {

		ListNode head1 = head;

		while (head != null && head.next != null) {
			if (head.next.val == head.val) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}

		return head1;

	}
}