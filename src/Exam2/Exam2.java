package Exam2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
                int[] initArray = scannerArray(scanner, array);
                outputNumbers(initArray);
            } else if (fillingType == 2) {
                int[] initArray = randomArray(random, array);
                outputNumbers(initArray);
            } else {
                System.out.println("error");
            }
            System.out.println("min number: " + minimalNumber(array));
            System.out.println("max number: " + maximumNumber(array));

            sortArray(array);
            System.out.println("sorted array: " + Arrays.toString(array));
        } else if (typeArray == 2) {
            System.out.println("In process....");
        } else {
            System.out.println("only '1' or '2'");
        }
    }

    static int initSize(Scanner scanner) {
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("enter positive number");
            initSize(scanner);
        }
        return size;
    }

    static int[] scannerArray(Scanner scanner, int[] array) {
        System.out.println("Enter array element: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            System.out.println("Enter array element: ");
        }
        return array;

    }

    static int[] randomArray(Random random, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    static void outputNumbers(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    static int minimalNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static int maximumNumber(int[] array) {
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
}

