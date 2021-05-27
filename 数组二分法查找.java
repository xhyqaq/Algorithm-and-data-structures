package com.算法;

/**
 * Author: Xhy
 * CreateTime: 2021-05-26 10:54
 *
 * @Description: 数组二分法查找
 *               前提：必须是排好序的
 *               每次从中间开始找
 *               1.找到了，返回
 *               2.没找到
 *                  1)、查找的数据大于中间的数据，则从右边继续开始二分法查找
 *                  2)、查找的数据小于中间的数据，则从左边继续开始二分法查找
 */
public class 数组二分法查找 {
    public static void main(String[] args) {
        int[] array = new int[]{2,5,10,155,200,333,444,555};
        int head = 0 ;
        int tail = array.length-1;
        int data = 333;
        while (head <= tail) {
            int middle = (head + tail ) / 2;
            if (data == array[middle]) {
                System.out.println("找到了"+middle);
                break;
            }else if (data < array[middle]) {
                tail = middle-1;
            }else {
                head = middle+1;
            }
        }

    }
}
