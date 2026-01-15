package ru.job4j.basics.loops;

import java.util.StringJoiner;

/*
  Задание: Написать код, который выводит в консоль через пробел в порядке
  возрастания все положительные трехзначные числа до 153 (не включая),
  оканчивающиеся на 7. Перед началом вывода нужно вывести слово "Старт"
  в отдельной строке, а после окончания вывода чисел - слово "Финиш",
  тоже в отдельной строке.

  Вывод должен получиться такой:

  Старт

  107 117 127 137 147

  Финиш
*/
public class Task19 {
    public static void loop() {
        System.out.println("Старт");

        StringJoiner sj = new StringJoiner(" ");

        for (int i = 100; i < 153; i++) {
            if (i % 10 == 7) {
                sj.add(String.valueOf(i));
            }
        }

        System.out.println(sj);
        System.out.println("Финиш");
    }

    public static void main(String[] args) {
        loop();
    }
}
