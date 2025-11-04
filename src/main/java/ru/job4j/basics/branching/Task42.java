package ru.job4j.basics.branching;

/*
  Ниже представлен метод isPairSymmetric(int number), который принимает целое
  четырехзначное положительное число.

  Четырехзначное число называется "парно-симметричным", если 2 его первых цифры
  и 2 его последних цифры образуют одинаковые числа (Например, 5252).

  Задание: Написать код, который определяет, является ли входящее число
  "парно-симметричным", и выводит в консоль "Да", если является или "Нет", если
  не является.

  Например, вывод для числа 4040 будет:

  Да
*/
public class Task42 {
    public static void isPairSymmetric(int number) {
        int num1 = number / 100;
        int num2 = number % 100;
        if (num1 == num2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isPairSymmetric(4040);
    }
}
