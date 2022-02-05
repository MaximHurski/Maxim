package com.company.Lessons.les8;

public class Seasons {
    public static void main(String[] args) {
        String[] seasonsDirect = new String[4]; /* объявили и создали массив. Java выделила память под массив из 4 строк, и сейчас в каждой ячейке записано значение null (поскольку строка — ссылочный тип)*/

        seasonsDirect[0] = "Winter"; /* в первую ячейку, то есть, в ячейку с нулевым номером мы записали строку Winter. Тут мы получаем доступ к нулевому элементу массива и записываем туда конкретное значение  */
        seasonsDirect[1] = "Spring"; // проделываем ту же процедуру с ячейкой номер 1 (второй)
        seasonsDirect[2] = "Summer"; // ...номер 2
        seasonsDirect[3] = "Autumn"; // и с последней, номер 3


        //===
        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        //or: String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};

        //print
        for (int i = 0; i < 4; i++) {
            System.out.println(seasons[i]);
        }
        //print N2
        int seasonsLength = seasons.length;
        for (int i = 0; i < seasonsLength; i++) {
            System.out.println(seasons[i]);
        }
    }
}
