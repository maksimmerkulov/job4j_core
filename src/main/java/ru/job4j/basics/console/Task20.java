package ru.job4j.basics.console;

/*
  Ниже представлен метод print(int x, int y), который принимает 2 целых числа.

  Задание: Написать код, который выводит на экран в первой строке через пробел
  значения входящих переменных, во второй ― сумму этих переменных, в третьей -
  произведение этих переменных.

  Например, вывод для чисел 3 и 5 будет:

  Переменные: 3 5

  Сумма: 8

  Произведение: 15
*/
public class Task20 {
    public static void print(int x, int y) {
        System.out.println("Переменные: " + x + " " + y);
        System.out.println("Сумма: " + (x + y));
        System.out.println("Произведение: " + (x * y));
    }

    public static void main(String[] args) {
        print(3, 5);
    }
}
