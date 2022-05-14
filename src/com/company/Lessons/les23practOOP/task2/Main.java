package com.company.Lessons.les23practOOP.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reader reader =new Reader();
        System.out.println("Введите имя");
        reader.setName(scanner.nextLine());
        System.out.println("Введите фамилию");
        reader.setLastName(scanner.nextLine());
        System.out.println("Введите возраст");
        reader.setAge(scanner.nextInt());
        System.out.println("Введите адресс");
        reader.setAdress(scanner.next());

        List<Map<Book,Reader>> mapList= new ArrayList<>();

        Book book = new Book("муму", "Тургеньев");
        Book book1 = new Book("Преступление и наказание", "Достоевский");
        Book book2 = new Book("Война и мир", "Толстой");

        ArrayList<Book>list1 = new ArrayList<>();
        list1.add(book);
        list1.add(book1);
        list1.add(book2);

        Library library = new Library();
        while (true){
            System.out.println("Введите 1 если хотите получить книгу: ");
            System.out.println("Введите 2 если хотите вернуть книгу: ");
            System.out.println("Введите 0 если хотите выйти из программы: ");

            Scanner scanner1 = new Scanner(System.in);
            int operation = scanner1.nextInt();

//            switch (operation){
//                case 0:
//                    System.exit(1);
//                    break;
//                case 1:
//                    System.out.println("Доступные книги: ");
//                    System.out.println(list1);
//                    int bookNumber = scanner.nextInt();
////                    list.add(library.takeBook(list1.get(bookNumber+1), reader));
//                    list1.remove(bookNumber+1);
//                    break;
//                    case2:
////                    System.out.println("ниги записанные на вас. Введите номер книги, которую хотят вернуть");
////                System.out.println(list);
////                int bookNum = scanner.nextInt();
////                Map.put(lis)
            }
        }


        }


