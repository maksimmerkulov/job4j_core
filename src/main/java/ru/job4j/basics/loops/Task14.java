package ru.job4j.basics.loops;

import java.util.StringJoiner;

/*
  Ниже представлен метод loop(int a, int b), который принимает 2 целых числа.

  Задание: Написать код, который выводит в консоль через пробел все
  положительные двузначные числа в диапазоне от первого числа (включая)
  до второго числа (не включая) в возрастающем порядке. Перед началом вывода
  нужно вывести слово "Старт" в отдельной строке, а после окончания вывода
  чисел - слово "Финиш", тоже в отдельной строке.

  Примечание: в этом и последующем упражнении для сборки результирующей
  строки с выводом значений через пробел нужно использовать StringJoiner.

  Например, для чисел -16 и 15 вывод будет:

  Старт

  10 11 12 13 14

  Финиш
*/
public class Task14 {
    public static void loop(int a, int b) {
        System.out.println("Старт");

        StringJoiner sj = new StringJoiner(" ");

        for (int i = a; i < b; i++) {
            if (i >= 10 && i <= 99) {
                sj.add(String.valueOf(i));
            }
        }

        System.out.println(sj);
        System.out.println("Финиш");
    }

    public static void main(String[] args) {
        loop(-16, 15);
    }
}
