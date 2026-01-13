package ru.job4j.basics.loops;

/*
  Дано целое число a и целое число n (> 0). Найти a в степени n:
  a^n = a·a·...·a (числа a перемножаются n раз).
*/
public class DegreeLoop {
    public static int calculate(int a, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(2, 2));
    }
}
