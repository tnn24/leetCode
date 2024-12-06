package com.tnn.problems;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P2Test {

    private static P2.ListNode parse(int num) {
        P2.ListNode dummy = new P2.ListNode(num % 10);
        P2.ListNode current = dummy;
        while ((num /= 10) > 0) {
            current.setNext(new P2.ListNode(num % 10));
            current = current.getNext();
        }
        return dummy;
    }

    private static boolean areListNodeEqual(P2.ListNode l1, P2.ListNode l2) {
        while (true) {
            if (l1 == null || l2 == null) {
                return l1 == l2;
            }
            if (l1.getVal() != l2.getVal()) {
                return false;
            }
            l1 = l1.getNext();
            l2 = l2.getNext();
        }
    }

    @DataProvider(parallel = true)
    public Object[][] data() {
        return new Object[][] {
                // Provided test cases
                {parse(342), parse(465), parse(807)},
                {parse(0), parse(0), parse(0)},
                {parse(999999), parse(9999), parse(1009998)},
        };
    }

    @Test(dataProvider = "data", enabled = true)
    public void test(P2.ListNode l1, P2.ListNode l2, P2.ListNode expectedResult) {
        P2.ListNode actual = P2.addTwoNumbers(l1, l2);
        Assert.assertEquals(actual, expectedResult);
    }
}