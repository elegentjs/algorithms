package win.elegentjs.algorithms.leetcode;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    /**
     * 1 -> 2 -> 4 -> 7 : 7421
     * 9 -> 9 : 99
     *
     * expect: 7520
     *
     */
    @Test
    public void testAddTwoNumbers() {
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(1);
        AddTwoNumbers.ListNode last = l1;
        last = last.next = new AddTwoNumbers.ListNode(2);
        last = last.next = new AddTwoNumbers.ListNode(4);
        last.next = new AddTwoNumbers.ListNode(7);

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(9);
        l2.next = new AddTwoNumbers.ListNode(9);

        System.out.println("l1: " + nodeToInt(l1));
        System.out.println("l2: " + nodeToInt(l2));

        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        int expected = 7520;
        int actual = nodeToInt(result);

        Assert.assertEquals(expected, actual);
    }

    private int nodeToInt(AddTwoNumbers.ListNode node) {
        int result = 0;

        int level = 1;
        while(node != null) {
            result += level * node.val;
            level *= 10;
            node = node.next;
        }

        return result;
    }
}