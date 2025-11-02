package ru.job4j.basics.branching;

/*
  Ниже представлен метод evenAmount(int number), который принимает целое
  положительное трехзначное число.

  Задание: Написать код, который высчитывает количество четных цифр во входящем
  трехзначном числе, и выводит результат в консоль.

  Переменная counter - это счетчик наших четных цифр.

  Например, для числа 650 вывод должен быть:

  2

  Примечание: в вычислениях нужно пользоваться операторами "вычисление остатка"
  (%), "вычисление частного"(/) и базовыми арифметическими операциями.
*/
public class Task33 {
    public static void evenAmount(int number) {
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
        evenAmount(650);
    }
}
