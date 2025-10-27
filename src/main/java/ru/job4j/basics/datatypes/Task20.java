package ru.job4j.basics.datatypes;

/*
  Ниже представлен метод separate(int number), который принимает целое
  положительное двузначное число.

  Задание: Отделить цифры данного числа друг от друга и вывести их в консоль в
  одну строку через пробел.

  Например, для числа 20 вывод должен быть:

  2 0

  Примечание: для вычислений можно пользоваться только операторами "вычисление
  остатка"(%) и "вычисление частного"(/).
*/
public class Task20 {
    public static void separate(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        System.out.println(num1 + " " + num2);
    }

    public static void main(String[] args) {
        separate(20);
    }
}
