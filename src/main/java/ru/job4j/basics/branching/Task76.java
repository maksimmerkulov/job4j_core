package ru.job4j.basics.branching;

/*
  Ниже представлен метод sameNumAmount(int num), который принимает целое
  положительное трехзначное число.

  Задание: Написать код, который определяет и выводит в консоль количество
  одинаковых цифр в этом числе.

  Например, для числа 331 вывод будет:

  2
*/
public class Task76 {
    public static void sameNumAmount(int num) {
        int first = num / 100;
        int middle = (num / 10) % 10;
        int last = num % 10;
        int count;

        if (first == middle && middle == last) {
            count = 3;
        } else if (first == middle || first == last || middle == last) {
            count = 2;
        } else {
            count = 0;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        sameNumAmount(331);
    }
}
