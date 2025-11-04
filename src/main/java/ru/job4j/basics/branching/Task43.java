package ru.job4j.basics.branching;

/*
  Ниже представлен метод containsZero(int number), который принимает целое
  трехзначное положительное число.

  Задание: Написать код, который определяет, содержится ли в этом числе хотя бы
  один ноль, и выводит в консоль "Да", если содержится или "Нет", если не
  содержится.

  Например, вывод для числа 407 будет:

  Да
*/
public class Task43 {
    public static void containsZero(int number) {
        int num1 = number / 100;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        containsZero(407);
    }
}
