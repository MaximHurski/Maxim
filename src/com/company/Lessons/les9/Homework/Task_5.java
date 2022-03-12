package com.company.Lessons.les9.Homework;

//Нарисовать в консоли шахматную доску (8x8) (нижняя левая клетка шахматной доски окрашена в чёрный цвет,
//следующая за ней — в белый, как и та, что над ней. Итак, цвет меняется каждый раз при переходе на
//соседнюю по стороне ячейку)
//+
public class Task_5 {
    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                if ((i + j) % 2 == 0) chess[i][j] = "W";
                else chess[i][j] = "B";
                System.out.print(chess[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
