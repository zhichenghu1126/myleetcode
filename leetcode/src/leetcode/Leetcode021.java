package leetcode;

public class Leetcode021 {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node3 = new ListNode(3);
		ListNode node5 = new ListNode(5);
		ListNode node2 = new ListNode(2);
		ListNode node4 = new ListNode(4);
		ListNode node6 = new ListNode(6);
		node3.next = node5;
		node1.next = node3;
		node4.next = node6;
		node2.next = node4;
		ListNode list = mergeTwoLists(node1, node2);
		System.out.println(list.val);
		System.out.println(list.next.val);
		System.out.println(list.next.next.val);
		System.out.println(list.next.next.next.val);
		System.out.println(list.next.next.next.next.val);
		System.out.println(list.next.next.next.next.next.val);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode init = new ListNode(-1);
		ListNode pre = init;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				pre.next = l1;
				l1 = l1.next;
			} else {
				pre.next = l2;
				l2 = l2.next;
			}
			pre = pre.next;
		}
		pre.next = l1 == null ? l2 : l1;
		return init.next;

	}

}
