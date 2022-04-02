package com.company.Lessons.les9;
//вывод 2мерного массива
public class Massiv_2 {
    public static void main(String[] args) {
        int[][] directInit = {{1, 2, 3, 17}, {1, 2, 17, 12}, {8, 1, 2, 3}};


        for (int i = 0; i < directInit.length; i++) {   //вывод 2мерного массива. Забирает количество массивов.
            for (int j = 0; j < directInit[i].length; j++) {     //забирает длину 1го массива и проходит строку
                System.out.print(directInit[i][j] + "\t");
            }
            System.out.println();
        }
    }
}