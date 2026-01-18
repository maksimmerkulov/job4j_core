package ru.job4j.basics.loops;

import java.util.StringJoiner;

/*
  Задание: Написать код, который выводит в консоль через пробел в порядке
  убывания все положительные двузначные числа до 38, делящиеся на 5 без остатка.
  Перед началом вывода нужно вывести слово "Старт" в отдельной строке, а после
  окончания вывода чисел - слово "Финиш", тоже в отдельной строке.

  Вывод должен получиться такой:

  Старт

  35 30 25 20 15 10

  Финиш
*/
public class Task21 {
    public static void loop() {
        System.out.println("Старт");

        StringJoiner sj = new StringJoiner(" ");

        for (int i = 35; i >= 10; i -= 5) {
            sj.add(String.valueOf(i));
        }

        System.out.println(sj);
        System.out.println("Финиш");
    }

    public static void main(String[] args) {
        loop();
    }
}
