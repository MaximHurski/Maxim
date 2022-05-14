package com.company.Lessons.les24enum;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        User user = new User("Bob", StateEnum.EURO);

        File file = new File("Text.txt");
        FileReader fileReader = new FileReader(file);
        FileInputStream fileInputStream = new FileInputStream(file);

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);




    }
}
