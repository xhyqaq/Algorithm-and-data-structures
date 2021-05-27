package com.算法;

/**
 * Author: Xhy
 * CreateTime: 2021-05-25 10:59
 *
 * @Description: 数组的反转
 */
public class 数组的反转 {
    public static void main(String[] args) {
        String[] s = new String[]{"DD","CC","BB","AA"};
        System.out.println(s.length);
        // 反转数组
        for (int i = 0; i < s.length / 2; i++) {
            // 获取前面的元素赋值给临时变量
            String temp = s[i];
            // 获取后面的元素赋值给前面的元素，后面的元素需要数组长度 - i - 1(-1是为了防止交换第一个下标下的数据
            // 时候数组下标越界)
            s[i] = s[s.length - i -1];
            // 获取后面的元素
            s[s.length - i - 1] = temp;
        }

        for (String s1:s) {
            System.out.print(s1 + "\t");
        }
    }
}
