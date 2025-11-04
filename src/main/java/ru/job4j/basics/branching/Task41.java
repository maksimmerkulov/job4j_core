package ru.job4j.basics.branching;

/*
  Ниже представлен метод evenDigitsAmount(int number), который принимает целое
  трехзначное положительное число.

  Задание: Написать код, который находит и выводит в консоль количество четных
  цифр в этом числе.

  Например, вывод для числа 320 будет:

  2
*/
public class Task41 {
    public static void evenDigitsAmount(int number) {
        int num1, num2, num3, counter = 0;
        num1 = number / 100;
        num2 = (number / 10) % 10;
        num3 = number % 10;

        if (num1 % 2 == 0) {
            counter++;
        }
        if (num2 % 2 == 0) {
            counter++;
        }
        if (num3 % 2 == 0) {
            counter++;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        evenDigitsAmount(320);
    }
}
