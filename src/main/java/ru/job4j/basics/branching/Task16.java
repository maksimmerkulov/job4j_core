package ru.job4j.basics.branching;

/*
  Ниже представлен метод zeroCheck(int number), который принимает целое число.

  Задание: Написать код, который выводит в консоль слово "Zero", если число -
  ноль, либо "Not zero", если число не ноль.
*/
public class Task16 {
    public static void zeroCheck(int number) {
        if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Not zero");
        }
    }

    public static void main(String[] args) {
        zeroCheck(0);
    }
}
