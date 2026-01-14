package ru.job4j.basics.loops;

/*
  Есть операция остаток от деления %. Вам даны два целых положительных числа
  n и d (d > 0). n — делимое, d — делитель. Вам нужно, не используя операцию
  %, найти остаток от деления.
*/
public class ModWithLoop {
    public static int mod(int n, int d) {
        while (n >= d) {
            n -= d;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(mod(4, 2));
    }
}
