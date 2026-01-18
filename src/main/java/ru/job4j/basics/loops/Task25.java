package ru.job4j.basics.loops;

import java.util.StringJoiner;

/*
  Ниже представлен метод loop(int num), который принимает целое положительное
  число - количество членов арифметической прогрессии.

  Пусть первый член прогрессии равен 7, а разница между соседними членами
  прогрессии равна 4 (в возрастающем порядке).

  Задание: Написать код, который выводит в консоль через пробел члены прогрессии
  в количестве равном входящему числу.

  Примечание: для сборки результирующей строки с выводом значений через пробел
  нужно использовать StringJoiner.

  Например, для числа 5 вывод будет:

  7 11 15 19 23
*/
public class Task25 {
    public static void loop(int num) {
        int start = 7;
        int step = 4;

        StringJoiner sj = new StringJoiner(" ");

        for (int i = 0; i < num; i++) {
            sj.add(String.valueOf(start + i * step));
        }

        System.out.println(sj);
    }

    public static void main(String[] args) {
        loop(5);
    }
}
