package com.github.anton_sinelnik;

import java.util.Scanner;

/** Ввести с клавиатуры два целых числа, которые будут координатами точки
 *  (первое считанное число - это координата "x", а второе - координата "y").
 *  Известно, что точка не лежит на координатных осях OX и OY.
 *  Вывести на экран номер координатной четверти, в которой находится данная точка.
 */

public class CoordinateQuarters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите координаты точки");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x > 0 && y < 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x < 0 && y > 0) {
            System.out.println("4");
        }
    }
}
