package com.dimple.algorithmCollection.niukewang.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 题目描述
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class Dimple03PrintListFromTailToHead {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode temp = listNode;
        for (int i = 2; i < 10; i++) {
            ListNode listNode1 = new ListNode(i);
            temp.next = listNode1;
            temp = listNode1;
        }
        ListNode listNode1 = null;
        System.out.println(printListFromTailToHead(listNode));
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (listNode == null) {
            return arrayList;
        }
        while (listNode != null) {
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    private static class ListNode {
        private int val;
        private ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
