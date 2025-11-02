package ru.job4j.basics.branching;

/*
  Ниже представлен метод isSymmetric(int number), который принимает целое
  трехзначное положительное число.

  Трехзначное число является симметричным, если первая и последняя его цифры
  одинаковы.

  Задание: Написать код, который проверяет, является ли входящее число
  симметричным. Если является - вывести "Да", если нет - "Нет".

  Например, вывод для числа 363 будет:

  Да
*/
public class Task39 {
    public static void isSymmetric(int number) {
        int first = number / 100;
        int last = number % 10;
        if (first == last) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isSymmetric(363);
    }
}
