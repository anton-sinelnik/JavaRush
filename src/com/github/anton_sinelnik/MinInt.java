package com.github.anton_sinelnik;

import java.util.Scanner;

/** Минимум из введенных чисел
 *  Программа должна считывать целые числа с клавиатуры до тех пор,
 *  пока не будет введено что-то другое: например, строка или символ.
 *  Выведи на экран минимальное число из введенных.
 *  Если введено несколько таких чисел, необходимо вывести любое из них.
 */

public class MinInt {
    public static void main(String[] args) {
        System.out.println("введи число");
        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (console.hasNextInt())
        {
            int x = console.nextInt();
            if (x<min)
                min = x;
        }
        System.out.println(min);
    }
}
