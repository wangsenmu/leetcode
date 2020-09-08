package com.wsm.leetcode.easy;

/**
 * @author wangsenmu
 * @date 2020-8-20 14:16
 * <p>
 * Reverse a singly linked list.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 * <p>
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReverseLinkedList {


    public static void main(String[] args) {
        new ReverseLinkedList().test();
    }


    public void test() {
        ListNode paramNode = new ListNode(1);
        ListNode paramNode1 = paramNode.next = new ListNode(2);
        ListNode paramNode2 = paramNode1.next = new ListNode(3);
        ListNode paramNode3 = paramNode2.next = new ListNode(4);
        ListNode paramNode4 = paramNode3.next = new ListNode(5);
        ListNode res = reverseList(paramNode);
        ListNode res1 = reverseListRecursion(paramNode);
        System.out.println(paramNode);
    }


    class ListNode {
        public ListNode(int val) {
            this.val = val;
        }

        private int val;
        private ListNode next;
    }


    /**
     * 要初始化指定前一个节点的node
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }


    public ListNode reverseListRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preNode = reverseListRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return preNode;
    }

}