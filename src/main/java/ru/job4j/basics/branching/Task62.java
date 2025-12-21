package ru.job4j.basics.branching;

/*
  Ниже представлен метод isRising(int number), который принимает целое
  трехзначное число, состоящее из 3 разных цифр.

  Задание: Написать код, который проверяет, располагаются ли цифры этого числа в
  порядке возрастания (первая - наименьшая, третья - наибольшая, все цифры
  разные), и выводит в консоль "Да", если располагаются, и "Нет", если не
  располагаются.

  Например, для числа 156 вывод будет:

  Да
*/
public class Task62 {
    public static void isRising(int number) {
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        if (hundreds < tens && tens < units) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isRising(156);
    }
}
