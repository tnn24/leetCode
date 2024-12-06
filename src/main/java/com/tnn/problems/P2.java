package com.tnn.problems;


import lombok.Data;
import lombok.Getter;

/**
 * <a href="https://leetcode.com/problems/add-two-numbers/">Add Two Numbers</a>
 */
public class P2 {
    @Data
    public static class ListNode {
        private int val;
        private ListNode next;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }

        public void print() {
            ListNode n = this;
            do {
                System.out.print(n.val);
            } while ((n = n.next) != null);
            System.out.println();
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int carryOver = 0;
        while (l1 != null || l2 != null || carryOver != 0) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int total = x + y + carryOver;
            int val = total % 10;
            carryOver = total / 10;
            current.next = new ListNode(val);
            current = current.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return dummy.next;
    }
}