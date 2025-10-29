package ru.job4j.basics.datatypes;

/*
  Ниже представлен метод evenAmount(int number), который принимает целое
  положительное четырехзначное число.

  Задание: Написать код, который высчитывает количество четных цифр во входящем
  четырехзначном числе, и выводит результат в консоль.

  Переменная counter - это счетчик наших четных цифр.

  Например, для числа 4012 вывод должен быть:

  3

  Примечание: в вычислениях нужно пользоваться операторами "вычисление остатка"
  (%), "вычисление частного"(/) и базовыми арифметическими операциями.
*/
public class Task34 {
    public static void evenAmount(int number) {
        int num1, num2, num3, num4, counter = 0;
        num1 = number / 1000;
        num2 = (number / 100) % 10;
        num3 = (number / 10) % 10;
        num4 = number % 10;
        counter = -((num1 % 2 - 1) + (num2 % 2 - 1) + (num3 % 2 - 1)
                + (num4 % 2 - 1));
        System.out.println(counter);
    }

    public static void main(String[] args) {
        evenAmount(4012);
    }
}
