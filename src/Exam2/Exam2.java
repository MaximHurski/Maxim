package Exam2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Реализовать следующую программу:
//Пользователю предоставляется возможность на выбор заполнить целочисленный массив или массив слов
//Если выбран массив чисел, то есть 2 варианта заполнения:
//а) самостоятельно, б) рандомными числами
//Выполнить над массивом следующие действия:
//•	Поиск максимального (минимального (можете 2 реализовать если успеете)) элемента
//•	Вернуть первый индекс введенного им элемента, иначе -
//•	Сортировка
//Если был выбран массив слов, то
//•	Отсортировать массив слов по алфавиту (лексикографически)
//•	Пользователю предоставляется возможность ввести букву. Вместо этой буквы теперь будет
// рандомное число (String.valueOf(randomNumber))

public class Exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Chose array type:");
        System.out.println("1- numbers, 2- strings");
        int typeArray = scanner.nextInt();
        if (typeArray == 1) {
            System.out.println("Enter array initialization type");
            System.out.println("1- manual, 2- random");
            int fillingType = scanner.nextInt();
            System.out.println("Enter array length");
            int[] array = new int[initSize(scanner)];
            if (fillingType == 1) {
                int[] initArray = initScannerArray(scanner, array);
                outputArray(initArray);
            } else if (fillingType == 2) {
                int[] initArray = initRandomArray(random, array);
                outputArray(initArray);
            } else {
                System.out.println("Error");
            }
            System.out.println("Min number: " + findMinNumber(array));
            System.out.println("Max number: " + findMaxNumber(array));
//where is method for finding index?
            System.out.println("Enter number whose index you want to find:");
            int userNum = initUserNum(scanner);
            System.out.println("Index of this number is : " + searchIndexArray(array, userNum));
            sortArray(array);
            System.out.println("Sorted array: " + Arrays.toString(array));
        } else if (typeArray == 2) {
            System.out.println("Enter array length");

            String[] array = new String[initSize(scanner)];
            String[] initArray = initScannerArray(scanner, array);
            outputArray(initArray);
            sortArray(array);
            System.out.println("Sorted array: " + Arrays.toString(array));
            System.out.println("Enter the letter you want to replace with a random number:");
            String replaceLetter = scanner.next();
            changeTheLetter(array, replaceLetter);

        } else {
            System.out.println("Only '1' or '2'");
        }
    }

    static int initSize(Scanner scanner) {
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Enter positive number");
            initSize(scanner);
        }
        return size;
    }

    //initScannerArray
    static int[] initScannerArray(Scanner scanner, int[] array) {
        System.out.println("Enter " + array.length + " numbers");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите символ #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }


    //initRandomArray
    static int[] initRandomArray(Random random, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }


    //printArray or outputArray
    static void outputArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    //findMinNumber
    static int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //findMaxNumber
    static int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    static void sortArray(int[] array) {
        Arrays.sort(array);
    }

    static void sortArray(String[] array) {
        Arrays.sort(array);
    }

    static int initUserNum(Scanner scanner) {
        int userNum = scanner.nextInt();
        return userNum;
    }

    static int searchIndexArray(int[] array, int userNum) {
        int index = 0;
        for (int i : array) {
            if (i == userNum) {
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }

    static String changeTheLetter(String[] array, String letter) {
        System.out.println("I give up(((((");
        return String.valueOf(array);
    }

    static String[] initScannerArray(Scanner scanner, String[] array) {
        System.out.println("Enter " + array.length + " words:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите слово #" + (i + 1) + ": ");
            array[i] = scanner.next();
        }
        return array;
    }

    static void outputArray(String[] array) {
        System.out.println(Arrays.toString(array));
    }
}


