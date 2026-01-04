package ru.job4j.basics.branching;

/*
  Ниже представлен метод diffNumAmount(int num), который принимает целое
  положительное трехзначное число.

  Задание: Написать код, который определяет и выводит в консоль количество
  разных цифр в этом числе.

  Например, для числа 225 вывод будет:

  2
*/
public class Task77 {
    public static void diffNumAmount(int num) {
        int first = num / 100;
        int middle = (num / 10) % 10;
        int last = num % 10;
        int count;

        if (first == middle && middle == last) {
            count = 0;
        } else if (first == middle || first == last || middle == last) {
            count = 2;
        } else {
            count = 3;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        diffNumAmount(225);
    }
}
