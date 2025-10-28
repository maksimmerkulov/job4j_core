package ru.job4j.basics.datatypes;

/*
  Ниже представлен метод numSum(int number), который принимает целое
  положительное двузначное число.

  Задание: Написать код, который высчитывает сумму цифр данного числа, и выводит
  результат в консоль.

  Например, для числа 35 вывод должен быть:

  8

  Примечание: для вычислений можно пользоваться только операторами "вычисление
  остатка"(%), "вычисление частного"(/) и базовыми арифметическими операциями.
*/
public class Task28 {
    public static void numSum(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
        numSum(35);
    }
}
