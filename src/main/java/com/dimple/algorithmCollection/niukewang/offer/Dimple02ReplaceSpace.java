package com.dimple.algorithmCollection.niukewang.offer;

/**
 * 题目描述
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Dimple02ReplaceSpace {
    public static void main(String[] args) {
        replaceSpace("We Are Happy");
    }

    public static void replaceSpace(String string) {
        String s = string.replaceAll("\\s", "%20");
        System.out.println(s);
    }
}
