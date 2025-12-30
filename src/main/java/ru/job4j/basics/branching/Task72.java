package ru.job4j.basics.branching;

/*
  Ниже представлен метод midDigitMore(int num), который принимает целое
  трехзначное число.

  Задание: Написать код, который определяет, является ли средняя цифра этого
  числа больше остальных. Вывести в консоль "Да", если является, и "Нет", если
  не является.

  Например, для числа 132 вывод будет:

  Да
*/
public class Task72 {
    public static void midDigitMore(int num) {
        int first = num / 100;
        int middle = (num / 10) % 10;
        int last = num % 10;

        if (middle > first && middle > last) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        midDigitMore(132);
    }
}
