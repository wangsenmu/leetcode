package com.wsm.leetcode.medium;

/**
 * @author wangsenmu
 * @date 2020-8-20 23:09
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 * <p>
 * Example:
 * <p>
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
public class SwapNodesInPairs {

    public static void main(String[] args) {
        new SwapNodesInPairs().test();
    }


    class ListNode {
        public ListNode(int val) {
            this.val = val;
        }

        private int val;
        private ListNode next;
    }


    public void test() {
        ListNode paramNode = new ListNode(1);
        paramNode.next = new ListNode(2);
        paramNode.next.next = new ListNode(3);
        paramNode.next.next.next = new ListNode(4);
        paramNode.next.next.next.next = new ListNode(5);
//        ListNode paramNode4 = paramNode3.next = new ListNode(4);

        ListNode listNode = swapPairs(paramNode);

        System.out.println(listNode);
    }


    public ListNode swapPairs(ListNode head) {

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode pre = temp;
        while (pre.next != null && pre.next.next != null) {
            ListNode first = pre.next;
            ListNode second = pre.next.next;
            pre.next = second;
            first.next = second.next;
            second.next = first;
            pre = first;
        }
        return temp.next;

    }

    public ListNode swapPairs1(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while(temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }




}