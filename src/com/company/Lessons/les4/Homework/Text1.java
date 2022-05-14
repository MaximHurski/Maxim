package com.company.Lessons.les4.Homework;
import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) throws Exception {
//        FileWriter fw = new FileWriter("xxx.txt");
//        fw.close();

        HashSet<String> set = new HashSet();

        FileReader fr= new FileReader("xxx.txt");
        Scanner scan = new Scanner(fr);



        while (scan.hasNextLine()) {
            scan.nextLine();
            set.add(String.valueOf(scan));
        }

        fr.close();
        System.out.println(set);
        System.out.println(set.size());

    }
}