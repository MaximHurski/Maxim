package com.company.Lessons.les22practice;

import java.util.ArrayList;
import java.util.List;

// создать эррэй лист со стрингами и отсортировать его по количеству символов
public class Task_1 {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();

            list.add("bfde");
            list.add("gd");
            list.add("asdafs");
            list.add("a");

            System.out.println(list);

            for (int i = 0; i < list.size()-1; i++) {            //сортировка пузырьком
                for (int j = i+1; j < list.size(); j++) {
                    if (list.get(i).length()>list.get(j).length()){
                        String temp;
                        temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                }
            }
            System.out.println(list);
        }
    }


