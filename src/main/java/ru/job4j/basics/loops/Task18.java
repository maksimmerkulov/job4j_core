package ru.job4j.basics.loops;

import java.util.StringJoiner;

/*
  Задание: Написать код, который выводит в консоль через пробел все
  положительные четные двузначные числа до 19 в порядке возрастания. Рядом
  с числом, которое делится на 4, нужно вывести символ "#". Перед началом
  вывода нужно вывести слово "Начало" в отдельной строке, а после окончания
  вывода чисел - слово "Конец", тоже в отдельной строке.

  Примечание: в этом и последующем упражнении для сборки результирующей строки
  с выводом значений через пробел нужно использовать StringJoiner.

  Вывод должен получиться такой:

  Начало

  10 12# 14 16# 18

  Конец
*/
public class Task18 {
    public static void loop() {
        System.out.println("Начало");

        StringJoiner sj = new StringJoiner(" ");

        for (int i = 10; i < 20; i += 2) {
            if (i % 4 == 0) {
                sj.add(i + "#");
            } else {
                sj.add(String.valueOf(i));
            }
        }

        System.out.println(sj);
        System.out.println("Конец");
    }

    public static void main(String[] args) {
        loop();
    }
}
