package ru.job4j.basics.loops;

import java.util.StringJoiner;

/*
  Ниже представлен метод loop(int a, int b), который принимает 2 целых числа.

  Задание: Написать код, который выводит в консоль через пробел все
  положительные трехзначные числа в диапазоне от второго числа (включая)
  до первого числа (не включая) в убывающем порядке. Перед началом вывода
  нужно вывести слово "Старт" в отдельной строке, а после окончания вывода
  чисел - слово "Финиш", тоже в отдельной строке.

  Примечание: в этом и последующем упражнении для сборки результирующей
  строки с выводом значений через пробел нужно использовать StringJoiner.

  Например, для чисел -16 и 104 вывод будет:

  Старт

  104 103 102 101 100

  Финиш
*/
public class Task15 {
    public static void loop(int a, int b) {
        System.out.println("Старт");

        StringJoiner sj = new StringJoiner(" ");

        for (int i = b; i > a; i--) {
            if (i >= 100 && i <= 999) {
                sj.add(String.valueOf(i));
            }
        }

        System.out.println(sj);
        System.out.println("Финиш");
    }

    public static void main(String[] args) {
        loop(-16, 104);
    }
}
