package ru.job4j.basics.branching;

/*
  Ниже представлен метод isWinning(int number), который принимает целое
  шестизначное число.

  В этой задаче нужно определить выигрышный билет. Пусть выигрышным считается
  такой билет, где сумма первых трех цифр входящего числа равна сумме последних
  трех цифр этого числа, и обе эти суммы являются четными.

  Задание: Написать код, который проверяет, является ли такой билет выигрышным,
  и выводит в консоль "Да", если является, и "Нет", если не является.

  Например, для числа 145505 вывод будет:

  Да
*/
public class Task58 {
    public static void isWinning(int number) {
        int n = Math.abs(number);

        int d1 = n / 100000;
        int d2 = n / 10000 % 10;
        int d3 = n / 1000 % 10;
        int d4 = n / 100 % 10;
        int d5 = n / 10 % 10;
        int d6 = n % 10;

        int firstSum = d1 + d2 + d3;
        int lastSum = d4 + d5 + d6;

        if (firstSum == lastSum && firstSum % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isWinning(145505);
    }
}
