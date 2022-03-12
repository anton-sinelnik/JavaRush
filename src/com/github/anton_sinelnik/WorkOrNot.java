package com.github.anton_sinelnik;

import java.util.Scanner;

/** Напишем программу, которая будет считывать с клавиатуры возраст. Если возраст от 20 до 60 (включительно),
 *  то выводить ничего не нужно, иначе - вывести фразу "можно не работать". Сделать это можно (и нужно!)
 *  с помощью только одного оператора if без else.
 */

public class WorkOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите Ваш возраст");
        int age = sc.nextInt();
        if (age < 20 || age > 60) {
            System.out.println("можно не работать");
        }
    }
}
