package ru.job4j.basics.loops;

import java.util.StringJoiner;

/*
  Задание: Написать код, который выводит в консоль через пробел в порядке
  возрастания все положительные трехзначные числа до 300, делящиеся на 80
  с остатком 45.

  Вывод должен получиться такой:

  125 205 285
*/
public class Task22 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");

        for (int i = 100; i < 300; i++) {
            if (i % 80 == 45) {
                sj.add(String.valueOf(i));
            }
        }

        System.out.println(sj);
    }

    public static void main(String[] args) {
        loop();
    }
}
