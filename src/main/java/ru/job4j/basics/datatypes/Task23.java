package ru.job4j.basics.datatypes;

/*
  Ниже представлен метод separate(int number), который принимает целое
  положительное трехзначное число.

  Задание: Отделить цифры данного числа друг от друга и вывести их в консоль в
  одну строку через пробел в обратном порядке.

  Например, для числа 205 вывод должен быть:

  5 0 2

  Примечание: для вычислений можно пользоваться только операторами "вычисление
  остатка"(%) и "вычисление частного"(/).
*/
public class Task23 {
    public static void separate(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number / 10) % 10;
        num3 = number % 10;
        System.out.println(num3 + " " + num2 + " " + num1);
    }

    public static void main(String[] args) {
        separate(205);
    }
}
