package ru.job4j.basics.datatypes;

/*
  В коде ниже у нас есть метод decreaseBy2(int number), который принимает на
  вход целое число.

  Задание: написать код, который выводит в консоль 3 предыдущих числа (от
  входящего). Каждое из 3 чисел нужно вывести на отдельной строке.

  Например: для входящего числа 6 вывод должен быть таким:

  5

  4

  3

  Важно! Вычисления нужно произвести только c помощью арифметических операций,
  то есть без помощи циклов и подобных средств языка Java.
*/
public class Task16 {
    public static void decreaseBy2(int number) {
        int a, b, c;
        a = number - 1;
        b = a - 1;
        c = b - 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        decreaseBy2(6);
    }
}
