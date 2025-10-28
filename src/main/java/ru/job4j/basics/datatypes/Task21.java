package ru.job4j.basics.datatypes;

/*
  Ниже представлен метод separate(int number), который принимает целое
  положительное трехзначное число.

  Задание: Отделить цифры данного числа друг от друга и вывести их в консоль в
  одну строку через пробел.

  Например, для числа 205 вывод должен быть:

  2 0 5

  Примечание: для вычислений можно пользоваться только операторами "вычисление
  остатка"(%) и "вычисление частного"(/).
*/
public class Task21 {
    public static void separate(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number / 10) % 10;
        num3 = number % 10;
        System.out.println(num1 + " " + num2 + " " + num3);
    }

    public static void main(String[] args) {
        separate(205);
    }
}
