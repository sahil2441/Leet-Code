package leetcode;
import java.util.LinkedList;
import java.util.Queue;

public class DeleteNode {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = null;
		ListNode reference = head.next.next;

		printList(head);
		deleteNode(reference);
		System.out.println();
		printList(head);

		Queue<Integer> queue = new LinkedList();

	}

	private static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + "->");
			node = node.next;
		}
	}

	private static void deleteNode(ListNode node) {
		if (node != null && node.next != null) {
			while (node.next.next != null) {
				node.val = node.next.val;
				node = node.next;
			}
			node.val = node.next.val;
			node.next = null;
		}
	}

}
