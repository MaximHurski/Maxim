package com.company.Lessons.les5.Classwork;

import java.util.Scanner;

public class Class_5 {

    public static void main(String[] args) {

        //      Напечатать числа от 1 до 10

//        int x = 0;
//
//        for (int i = 1; i <= 10; i++) {
//            x+= 1;
//            System.out.println(x);
//        }
//    }
//}


        Scanner scan = new Scanner(System.in);

//// Найти сумму 1+1/2+....+1/n
//
//            System.out.println("Enter number:");
//            int n = scan.nextInt();
//            double sum = 0;
//            for (double i = 1; i <= n; i++) {
//                sum += 1 / i;
//            }
//
//            System.out.println(sum);
//        }
//    }


        // Найти факториал любого введенного числа с клавиатуры  (x=1*2*....*n)
//            System.out.println("Enter number:");
//            int n = scan.nextInt();
//            double mult = 1;
//            for (int i = 1; i <= n; i++) {
//                mult *=i;
//            }
//
//            System.out.println(mult);
//        }
//    }

        // Написать программу которая вып обратный отсчет от 10 до 0
//        int i = 10;
//        while (i >= 0) {
//            System.out.println(i);
//            i++;
//        }
//    }
//}

        // Найти сумму 1+1/2+....+1/n   через while
//        System.out.println("Enter number:");
//            int n = scan.nextInt();
//            double sum = 0;
//        double i = 1;
//        while (i <= n) {
//            i++;
//            sum += 1 / i;
//        }System.out.println(sum);
//    }
//}

//        int x = 10;
//        do {
//            System.out.print("Значение x:" + x);
//            x++;
//            System.out.print("\n");
//        } while (x < 10);
//    }
//


        for (int i = 0; i < 10; i++) {     // (условие входа; условие выхода; i- прибавляет по единице)
            if (i == 5)

                break;
            System.out.println(i);
        }}}