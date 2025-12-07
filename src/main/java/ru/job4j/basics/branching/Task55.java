package ru.job4j.basics.branching;

/*
  Ниже представлен метод apartmentPlace(int number), который принимает целое
  положительное число.

  На каждом этаже многоквартирного дома три квартиры. Счет идет слева направо.
  Например, на первом этаже квартира 1 расположена слева, квартира 2 по центру и
  квартира 3 - справа, и т.д.

  Задание: Написать код, который находит этаж квартиры, и какое место она
  занимает на этом этаже. Результат вывести в консоль построчно. Обозначение
  расположения квартир: 1 - слева, 2 - центр, 3 - справа.

  Например, для квартиры 12 вывод будет:

  4

  3
*/
public class Task55 {
    public static void apartmentPlace(int number) {
        int floor = (number + 2) / 3;
        int position = number % 3;
        if (position == 0) {
            position = 3;
        }
        System.out.println(floor);
        System.out.println(position);
    }

    public static void main(String[] args) {
        apartmentPlace(12);
    }
}
