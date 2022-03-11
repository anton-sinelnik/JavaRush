package com.github.anton_sinelnik;

import java.util.Scanner;

/** расставить фигурные скобки.
 * Если возраст меньше 18 и больше либо равен 6, нужно вывести только сообщение "нужно ходить в школу".
 * Если возраст больше либо равен 18, нужно вывести только сообщение "пора в институт".
 * Если возраст меньше 6, то ничего не делать.
 */

public class ShcoolOrUnivercity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи возраст");
        int age = scanner.nextInt();
        if (age < 18) {
            if (age >= 6)
                System.out.println("нужно в школу");
        } else
            System.out.println("пора в институт");
    }
}
