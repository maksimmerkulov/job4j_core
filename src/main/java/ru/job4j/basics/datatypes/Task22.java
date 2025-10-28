package ru.job4j.basics.datatypes;

/*
  Ниже представлен метод separate(int number), который принимает целое
  положительное двузначное число.

  Задание: Отделить цифры данного числа друг от друга и вывести их в консоль в
  одну строку через пробел в обратном порядке.

  Например, для числа 20 вывод должен быть:

  0 2

  Примечание: для вычислений можно пользоваться только операторами "вычисление
  остатка"(%) и "вычисление частного"(/).
*/
public class Task22 {
    public static void separate(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        System.out.println(num2 + " " + num1);
    }

    public static void main(String[] args) {
        separate(20);
    }
}
