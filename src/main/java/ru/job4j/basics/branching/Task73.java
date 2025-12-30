package ru.job4j.basics.branching;

/*
  Ниже представлен метод midDigitLess(int num), который принимает целое
  трехзначное число.

  Задание: Написать код, который определяет, является ли средняя цифра этого
  числа меньше остальных. Вывести в консоль "Да", если является, и "Нет", если
  не является.

  Например, для числа 426 вывод будет:

  Да
*/
public class Task73 {
    public static void midDigitLess(int num) {
        int first = num / 100;
        int middle = (num / 10) % 10;
        int last = num % 10;

        if (middle < first && middle < last) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        midDigitLess(426);
    }
}
