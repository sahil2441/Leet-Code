/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		return reverseListNode(head, null);
	}

	public ListNode reverseListNode(ListNode head, ListNode newHead) {
		if (head == null) {
			return newHead;
		}
		ListNode next = head.next;
		head.next = newHead;
		return reverseListNode(next, head);
	}
}