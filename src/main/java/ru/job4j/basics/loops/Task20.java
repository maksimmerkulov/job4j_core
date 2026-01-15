package ru.job4j.basics.loops;

import java.util.StringJoiner;

/*
  Задание: Написать код, который выводит в консоль через пробел в порядке
  убывания все четырехзначные числа от 1050 до 1550, оканчивающиеся на 00.
  Перед началом вывода нужно вывести слово "Начало" в отдельной строке,
  а после окончания вывода чисел - слово "Конец", тоже в отдельной строке.

  Вывод должен получиться такой:

  Начало

  1500 1400 1300 1200 1100

  Конец
*/
public class Task20 {
    public static void loop() {
        System.out.println("Начало");

        StringJoiner sj = new StringJoiner(" ");

        for (int i = 1500; i >= 1050; i -= 100) {
            sj.add(String.valueOf(i));
        }

        System.out.println(sj);
        System.out.println("Конец");
    }

    public static void main(String[] args) {
        loop();
    }
}
