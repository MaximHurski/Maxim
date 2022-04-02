package com.company.Lessons.les15;

public class Test {
        public static void main(String args[]) {
            String s1 = "apple";
            String s2 = "orange";
            compareStrings(s1, s2);
            String s3 = "apple";
            String s4 = "Orange";
            compareStrings(s3, s4);
            String s5 = "sole";
            String s6 = "soul";
            compareStrings(s5, s6);
            String s7 = "john";
            String s8 = "johnson";
            compareStrings(s7, s8);
            String s9 = "one";
            String s10 = "one";
            compareStrings(s9, s10);

        }

        public static void compareStrings(String s1, String s2) {

            int comparedResult = s1.compareTo(s2);

            if (comparedResult > 0) {
                System.out.println(s1 + " comes after " + s2);
            } else if (comparedResult < 0) {
                System.out.println(s1 + " comes before " + s2);
            } else {
                System.out.println(s1 + " is equal to " + s2);
            }


        }
    }

