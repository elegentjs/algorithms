package win.elegentjs.algorithms.leetcode;

/**
 * 俩数相加：两个链表分别代表两个数，链表中存储的顺序是先存的数字的低位，要求使用链表输出
 * 相加的结果，一样是逆序输出，即低位先输出
 *
 * 思路：
 *
 * 1）迭代一次链表，计算相应位置的值，要注意进位
 *    时间复杂度：O（n）
 *    空间复杂度：O（n）
 *
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carray = 0;
        ListNode head = new ListNode();
        ListNode last = head;
        ListNode curr = null;

        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carray;

            curr = new ListNode();
            last.next  = curr;

            if (sum < 10) {
                carray = 0;
                curr.val = sum;
            } else {
                carray = 1;
                curr.val = sum % 10;
            }

            last = curr;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            curr = new ListNode();
            int sum = l1.val + carray;

            if (sum < 10) {
                carray = 0;
                curr.val = sum;
            } else {
                carray = 1;
                curr.val = sum % 10;
            }

            last.next  = curr;
            last = curr;

            l1 = l1.next;
        }

        while (l2 != null) {
            curr = new ListNode();

            int sum = l2.val + carray;

            if (sum < 10) {
                carray = 0;
                curr.val = sum;
            } else {
                carray = 1;
                curr.val = sum % 10;
            }

            last.next  = curr;
            last = curr;

            l2 = l2.next;
        }

        if (carray > 0) {
            curr = new ListNode();
            curr.val = carray;
            last.next  = curr;
        }

        return head.next;
    }


    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
