package com.github.anton_sinelnik;

import java.util.Scanner;

/** Сумма кратных чисел
 *  В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
 *  Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно)
 *  до end (не включительно), кратных multiple.
 *  Для этого используй цикл for.
 */

public class SumMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i%multiple!=0) {
               continue;
            }
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
