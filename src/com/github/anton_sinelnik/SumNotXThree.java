package com.github.anton_sinelnik;

/** Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3.
 *  Для этого используй цикл while.
 */

public class SumNotXThree {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        while (n <= 100) {
            if (n % 3 == 0) {
                n++;
            continue;
            } sum = sum + n;
                n++;
            } System.out.println(sum);
        }
    }