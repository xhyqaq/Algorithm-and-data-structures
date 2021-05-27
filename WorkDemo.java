package com.算法;

/**
 * Author: Xhy
 * CreateTime: 2021-05-26 22:13
 *
 * @Description: 算法复习
 */
public class WorkDemo {
    public static void main(String[] args) {
        arrayBubblingSort();
    }

    public static void arrayBubblingSort(){
        int[] arr = new int[]{-50,-9,-25,20,10,50,60,30,55};

        // 外层for控制循环的轮数
        for(int i = 0; i<arr.length-1;i++){

            // 内层for控制交换的次数
            for(int j = 0 ; j<arr.length - i - 1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int arrays :arr) {
            System.out.print(arrays + " \t");
        }
    }

    // 数组的二分法查找
    public static void arrayDichotomy(){
        int[] arr = new int[]{-10,-9,10,20,30,50,60,70};
        int findDate = 70;

        int head = 0;
        int tail = arr.length-1;

        while(head <= tail){
            int middle = (head+tail) / 2;
            if(findDate == arr[middle]){
                System.out.print("找到了"+middle);
                break;
            }else if(findDate < arr[middle]){
                tail = middle - 1;
            }else {
                head = middle +1;
            }

        }
    }


    // 数组反转
    public static void arrReversal(){
        int[] arr = new int[]{1,2,3,4,5,6,7};
        for(int i = 0; i <arr.length / 2;i++){
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        for(int arrays :arr) {
            System.out.print(arrays);
        }
    }
}
