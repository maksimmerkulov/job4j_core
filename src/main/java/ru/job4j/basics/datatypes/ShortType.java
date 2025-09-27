package ru.job4j.basics.datatypes;

import java.util.Scanner;

/*
  В Java есть 8 примитивных типов. short описывает число от числа от -32,768 до
  32,767.

  Ниже приведен код. Программа получает от пользователя число в диапазоне short
  и выводит его на консоль.

  Поправьте программу, чтобы она компилировалась.
*/
public class ShortType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short value = in.nextShort();
        System.out.println(value);
    }
}
