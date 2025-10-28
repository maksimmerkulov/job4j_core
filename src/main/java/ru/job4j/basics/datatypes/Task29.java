package ru.job4j.basics.datatypes;

/*
  Ниже представлен метод numSum(int number), который принимает целое
  положительное трехзначное число.

  Задание: Написать код, который высчитывает сумму цифр данного числа, и выводит
  результат в консоль.

  Например, для числа 325 вывод должен быть:

  10

  Примечание: для вычислений можно пользоваться только операторами "вычисление
  остатка"(%), "вычисление частного"(/) и базовыми арифметическими операциями.
*/
public class Task29 {
    public static void numSum(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number / 10) % 10;
        num3 = number % 10;
        System.out.println(num1 + num2 + num3);
    }

    public static void main(String[] args) {
        numSum(325);
    }
}
