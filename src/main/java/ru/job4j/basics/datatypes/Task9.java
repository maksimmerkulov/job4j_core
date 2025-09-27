package ru.job4j.basics.datatypes;

import java.util.Scanner;

/*
  Даны два действительных числа a и b. Вычислить их сумму, разность,
  произведение и частное.

  Результат вычислений выведите на консоль в порядке следования.

  - сумма

  - разность

  - произведение

  - частное
*/
public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
