package com.github.anton_sinelnik;

import java.util.Scanner;

/** Суммирование
 *  Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
 *  пока пользователь не введет слово "ENTER".
 *  Вывести на экран полученную сумму и завершить программу.
 */


public class Totalization {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("введи число для суммирования, для результата введи <enter>");
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (console.hasNextInt()) {
                int x = console.nextInt();
                sum += x;
            } else if (console.hasNextLine()){
            String s = console.nextLine();
            if (isExit = s.equals("enter")){
                isExit = true;
            }
        }
    } System.out.println(sum);
    }
}