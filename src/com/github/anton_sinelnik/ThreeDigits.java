package com.github.anton_sinelnik;


import java.util.Scanner;

/** Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
 *  Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой,
 *  то вывести все три.
 */

public class ThreeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введи три числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b  && b!=c) {
            System.out.println(a + " " + b);
        } else if (b == c  && c!=a) {
            System.out.println(b + " " + c);
        } else if (a == c  && b!=c) {
            System.out.println(a + " " + c);
        } else if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        }
    }
}

