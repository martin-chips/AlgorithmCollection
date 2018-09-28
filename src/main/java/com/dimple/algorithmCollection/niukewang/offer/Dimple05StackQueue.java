package com.dimple.algorithmCollection.niukewang.offer;

import java.sql.SQLOutput;
import java.sql.Statement;
import java.util.Stack;

/**
 * 题目描述
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Dimple05StackQueue {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    //1 2 3 4
    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        //去除需要删除的栈顶元素
        Integer pop = stack2.pop();
        //将Stack2的数据返回到stack1中
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return pop;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            push(i);
        }
        System.out.println(stack1.toString());
        pop();
        System.out.println(stack1.toString());

    }
}
