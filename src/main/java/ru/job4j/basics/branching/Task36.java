package ru.job4j.basics.branching;

/*
  Ниже представлен метод sameNums(int number), который принимает целое
  двузначное положительное число.

  Задание: Написать код, который проверяет, состоит ли это число из одинаковых
  цифр. Вывести в консоль "Да", если состоит, и "Нет", если не состоит.

  Например, для числа 33 вывод будет:

  Да
*/
public class Task36 {
    public static void sameNums(int number) {
        int first = number / 10;
        int second = number % 10;
        if (first == second) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        sameNums(33);
    }
}
