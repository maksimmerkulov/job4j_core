package ru.job4j.basics.branching;

/*
  Ниже представлен метод maxDigit(int number), который принимает целое
  двузначное положительное число.

  Задание: Написать код, который выводит на консоль наибольшую из цифр этого
  числа. Если цифры равны - вывести "Равны".

  Например, вывод для числа 37 будет:

  7
*/
public class Task38 {
    public static void maxDigit(int number) {
        int first = number / 10;
        int second = number % 10;
        if (first > second) {
            System.out.println(first);
        } else if (second > first) {
            System.out.println(second);
        } else {
            System.out.println("Равны");
        }
    }

    public static void main(String[] args) {
        maxDigit(37);
    }
}
