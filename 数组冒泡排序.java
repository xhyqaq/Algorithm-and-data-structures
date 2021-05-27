package com.算法;

/**
 * Author: Xhy
 * CreateTime: 2021-05-26 15:44
 *
 * @Description: 数组冒泡排序
 *                  原理：
 *                      前一个元素和后一个元素做比较，如果前一个元素 > 后一个元素，则交换位置，依次执行。
 *                      例如：
 *                          int[] arr = new int[]{55,22,-12,100,-50,30,15};
 *                          55 > 22 则交换
 *                          int[] arr = new int[]{22,55,-12,100,-50,30,15};
 *                          55 > -12 则交换
 *                          int[] arr = new int[]{22,-12,55,100,-50,30,15};
 *                          依次交换，直至跟所有元素交换完毕，则称为交换了一轮，每一轮交换后都会出现最大值或者最小值，此时最大值或者最小值
 *                          就不用再参与比较，每一轮交换完毕后，交换的次数要数组长度 - 1
 *                   代码：
 *                      使用嵌套for循环实现，外层for控制需要交换的轮数，内层for控制元素的交换
 */
public class 数组冒泡排序 {
    public static void main(String[] args) {
        int[] arr = new int[]{55,22,-12,100,-50,30,15};

        // 控制交换的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            // 控制元素交换
            for (int j = 0; j < arr.length - 1 -i; j++) {
                // 55 > 22
                if (arr[j] > arr[j+1]) {
                    // 获取前一个元素 55
                    int temp = arr[j];
                    // 交换元素 55 = 22
                    arr[j] = arr[j+1];
                    // arr[j+1] = 55
                    arr[j+1] = temp;
                }
            }
        }

        for (int arrays : arr) {
            System.out.println(arrays);
        }
    }
}
