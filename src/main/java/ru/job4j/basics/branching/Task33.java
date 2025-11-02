package ru.job4j.basics.branching;

/*
  Ниже представлен метод numSquare(int number), который принимает целое число.

  Задание: Написать код, который выводит в консоль квадрат этого числа, если оно
  отрицательное, иначе вывести "Ошибка".

  Например, для числа 2 вывод будет:

  Ошибка
*/
public class Task33 {
    public static void numSquare(int number) {
        if (number < 0) {
            System.out.println(number * number);
        } else {
            System.out.println("Ошибка");
        }
    }

    public static void main(String[] args) {
        numSquare(2);
    }
}
