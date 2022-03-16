package com.github.anton_sinelnik;

import java.util.Scanner;

/** Вводим данные с клавиатуры и сразу их выводим на экран,
 * пока не будет введено слово "enough".
 * Для этого необходимо использовать бесконечный цикл (while(true)).
 */

public class InfinityLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введи строку. для выхода введи <enough>");
            String s = sc.nextLine();

             if (s.equals("enough")) {
                break;
            } System.out.println("вы ввели" + s);
        }
    }
}
