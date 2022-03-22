package com.github.anton_sinelnik;

import java.util.Scanner;

/**
 *4
 *  В этой задаче нужно:
 *  1. Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
 *  2. Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
 *  Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.
 */

public class DoWhileTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введи строку");
        String str = console.nextLine();
        System.out.println("Введи число");
        int number = console.nextInt();
        int i = 0;

        do {
            System.out.println(str);
            i++;
        }
        while (number > 0 && number < 5 && i < number );
    }
}
