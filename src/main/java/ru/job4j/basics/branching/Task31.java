package ru.job4j.basics.branching;

/*
  Ниже представлен метод numCompare(int num1, int num2), который принимает 2
  целых числа.

  Задание: Написать код, который выводит эти числа на консоль в порядке
  возрастания в одной строке и в порядке убывания в другой строке.

  Например, для чисел 2 и -1 вывод будет:

  -1 2

  2 -1
*/
public class Task31 {
    public static void numCompare(int num1, int num2) {
        if (num1 < num2) {
            System.out.println(num1 + " " + num2);
            System.out.println(num2 + " " + num1);
        } else {
            System.out.println(num2 + " " + num1);
            System.out.println(num1 + " " + num2);
        }
    }

    public static void main(String[] args) {
        numCompare(2, -1);
    }
}
