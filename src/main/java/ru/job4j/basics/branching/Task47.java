package ru.job4j.basics.branching;

/*
  Ниже представлен метод changeNum(int number), который принимает целое
  трехзначное положительное число.

  Задание: Написать код, который изменяет это число следующим образом:

  - Для чисел, больших 500, переставляет местами числа единиц и сотен (вместо
  743 - 347).

  - В остальных числах переставляются местами числа десятков и единиц (вместо
  474 - 447).

  Результат вывести в консоль.

  Например, вывод для числа 591 будет:

  195
*/
public class Task47 {
    public static void changeNum(int number) {
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        int result;

        if (number > 500) {
            result = ones * 100 + tens * 10 + hundreds;
        } else {
            result = hundreds * 100 + ones * 10 + tens;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        changeNum(591);
    }
}
