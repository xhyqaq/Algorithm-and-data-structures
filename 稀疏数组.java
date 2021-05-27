package com.算法;

/**
 * Author: Xhy
 * CreateTime: 2021-05-27 16:56
 *
 * @Description: 稀疏数组
 *               稀疏数组只会有3列，行数由二维数组中的元素个数所决定。
 *               稀疏数组第一行不保存元素下标
 *               第一行保存的是二维数组的行数，列数，元素的个数
 *               第二行保存的是二维数组元素存在的行数，列数，元素
 *               .....
 */
public class 稀疏数组 {
    public static void main(String[] args) {
        // 创建一个二维数组
        int[][] chess = new int[11][11];

        // 给二维数组添加元素
        chess[1][2] = 1;
        chess[2][3] = 5;
        chess[5][6] = 5;
        // 遍历二维数组并且获取二维数组里的元素个数
        int sum = 0;
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                System.out.print(chess[i][j] + "\t");
                if (chess[i][j] != 0){
                    sum++;
                }
            }
            System.out.println();
        }

        /**
         * 创建稀疏数组
         * 稀疏数组的行数根据二维数组里元素的个数来决定
         * 稀疏数组的第一行保存的是二维数组的行数，列数，存在元素的个数
         */
        System.out.println("接下来是稀疏数组的遍历");
        // 初始化稀疏数组第一行初始数据，二维数组的行数，列数，元素个数
        int[][] sparseArray = new int[sum+1][3];
        sparseArray[0][0] = chess.length;
        sparseArray[0][2] = sum;
        sparseArray[0][1] = chess[0].length;
        // 初始化稀疏数组的行,从第一行开始
        int line = 1;
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if (chess[i][j] != 0){
                    // 给稀疏数组第line行,第0列赋值元素存在的行数
                    sparseArray[line][0] = i;
                    // 给稀疏数组第line行,第1列赋值元素存在的列数
                    sparseArray[line][1] = j;
                    // 给稀疏数组第line行,第2列赋值元素
                    sparseArray[line][2] = chess[i][j];
                    line++;
                }
            }
        }

        // 遍历稀疏数组
        for (int i = 0; i < sparseArray.length; i++) {
            for (int j = 0; j < sparseArray[i].length; j++) {
                System.out.print(sparseArray[i][j] + "\t");
            }
            System.out.println();
        }

        // 稀疏数组转换二维数组
        System.out.println("稀疏数组转换为二维数组");
        int[][] chess2 = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {
            chess2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }

        // 遍历二维数组
        for (int i = 0; i < chess2.length; i++) {
            for (int j = 0; j < chess2[i].length; j++) {
                System.out.print(chess2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
