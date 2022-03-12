package com.github.anton_sinelnik;

import java.util.Scanner;

/** Напиши программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
 *  Для этого тебе нужно: 1. Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
 *  2. Определить возможность существования треугольника по сторонам.
 *  Результат вывести на экран
 */

public class Triangle {
    private static final String TRIANGLE_EXIST = "треугольник существует";
    private static final String TRIANGLE_NOT_EXIST = "треугольник не существует";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите три стороны предполаемого треугольника");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println(TRIANGLE_NOT_EXIST);
        } else {
            System.out.println(TRIANGLE_EXIST);
        }
    }
}
