package ru.job4j.basics.branching;

/*
  Ниже представлен метод numsCompare(int number), который принимает целое
  двузначное положительное число.

  Задание: Написать код, который проверяет, является ли первая цифра этого числа
  (десятки) больше второй (единицы). Вывести в консоль "Да", если является, и
  "Нет", если не является.

  Например, вывод для числа 11 будет:

  Нет
*/
public class Task37 {
    public static void numsCompare(int number) {
        int first = number / 10;
        int second = number % 10;
        if (first > second) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        numsCompare(11);
    }
}
