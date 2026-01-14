package ru.job4j.basics.loops;

/*
  Дано число, нужно получить сумму его цифр.

  Например,

  12 => 1 + 2 => 3
*/
public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1));
    }
}
