package ru.job4j.basics.datatypes;

/*
  Ниже представлен метод separate(int number), который принимает целое
  положительное двузначное число.

  Задание: Вывести входящее число в консоль в одну строку в "полном виде", то
  есть в виде "десятки+единицы".

  Например, для числа 34 вывод должен быть:

  30+4

  Примечание: для вычислений можно пользоваться только операторами "вычисление
  остатка"(%), "вычисление частного"(/) и базовыми арифметическими операциями.
*/
public class Task24 {
    public static void separate(int number) {
        int num1, num2;
        num1 = number - (number % 10);
        num2 = number % 10;
        System.out.println(num1 + "+" + num2);
    }

    public static void main(String[] args) {
        separate(34);
    }
}
