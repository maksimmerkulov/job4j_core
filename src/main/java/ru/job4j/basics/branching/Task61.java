package ru.job4j.basics.branching;

/*
  Ниже представлен метод hasEqualDigits(int number), который принимает целое
  трехзначное число.

  Задание: Написать код, который проверяет, состоит ли это число из одинаковых
  цифр, и выводит в консоль "Да", если состоит, и "Нет", если не состоит.

  Например, для числа 333 вывод будет:

  Да
*/
public class Task61 {
    public static void hasEqualDigits(int number) {
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        if (hundreds == tens && tens == units) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        hasEqualDigits(333);
    }
}
