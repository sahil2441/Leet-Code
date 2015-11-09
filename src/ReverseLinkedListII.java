/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class ReverseLinkedListII {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode h1 = head;
		if (head == null) {
			return null;
		}
		if (getLength(head) < n) {
			return head;
		}

		ListNode first = head;
		int count = 1;
		while (count < m) {
			head = first;
			first = first.next;
			count++;
		}

		ListNode second = first;
		while (count < n) {
			second = second.next;
			count++;
		}
		ListNode nextNode = second.next;
		reverseList(first, null, second);
		first.next = nextNode;

		if (head != first) {
			head.next = second;
			return h1;
		} else {
			return second;
		}
	}

	public void reverseList(ListNode head, ListNode newHead, ListNode second) {
		if (head == second) {
			head.next = newHead;
			return;
		}
		ListNode next = head.next;
		head.next = newHead;
		reverseList(next, head, second);
	}

	public int getLength(ListNode node) {
		int length = 0;
		while (node != null) {
			node = node.next;
			length++;
		}
		return length;
	}
}