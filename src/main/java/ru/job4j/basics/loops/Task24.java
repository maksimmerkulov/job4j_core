package ru.job4j.basics.loops;

import java.util.StringJoiner;

/*
  Ниже представлен метод loop(int num), который принимает целое число.

  Задание: Написать код, который выводит в консоль через пробел 5 чисел,
  отвечающих следующим условиям:

  - Серия начинается с числа, которое меньше входящего на 10.

  - Каждое число в серии (начиная со второго) меньше предыдущего на 6.

  Например, для числа 50 вывод будет:

  40 34 28 22 16
*/
public class Task24 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        int value = num - 10;

        for (int i = 0; i < 5; i++) {
            sj.add(String.valueOf(value));
            value -= 6;
        }

        System.out.println(sj);
    }

    public static void main(String[] args) {
        loop(50);
    }
}
