package ru.job4j.basics.loops;

/*
  Дано целое число n (> 0). Нужно вывести делители числа. Делитель это число
  на которое делится заданное число.

  Например,

  Для 1, это 1

  Для 2, это 1 и 2

  Для 6, это 1, 2, 3, 6

  Для 7, это 1, 7

  Каждый делитель нужно выводить с новой строки.
*/
public class Multipliers {
    public static void out(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        out(1);
    }
}
