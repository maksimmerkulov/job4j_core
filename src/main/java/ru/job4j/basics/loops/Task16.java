package ru.job4j.basics.loops;

import java.util.StringJoiner;

/*
  Задание: Написать код, который выводит в консоль все однозначные положительные
  числа. Перед началом вывода нужно вывести слово "Старт" в отдельной строке,
  а после окончания вывода чисел - слово "Финиш", тоже в отдельной строке.

  Примечание: в этом и последующем упражнении для сборки результирующей строки
  с выводом значений через пробел нужно использовать StringJoiner.


  Вывод должен получиться такой:

  Старт

  1 2 3 4 5 6 7 8 9

  Финиш
*/
public class Task16 {
    public static void loop() {
        System.out.println("Старт");

        StringJoiner sj = new StringJoiner(" ");

        for (int i = 1; i <= 9; i++) {
            sj.add(String.valueOf(i));
        }

        System.out.println(sj);
        System.out.println("Финиш");
    }

    public static void main(String[] args) {
        loop();
    }
}
