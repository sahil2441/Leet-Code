public class AddTwoNumbers {

	public static void main(String[] args) {
		// System.out.println(Integer.toBinaryString(4));
		String s = "06581228788";
		int x = Integer.parseInt("06581228788");
		System.out.println(x);

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode head = result;
		int sum = 0;

		while (l1 != null || l2 != null || sum > 0) {
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			head.next = new ListNode(sum % 10);
			head = head.next;

			sum /= 10;
		}

		return result.next;

	}
}
