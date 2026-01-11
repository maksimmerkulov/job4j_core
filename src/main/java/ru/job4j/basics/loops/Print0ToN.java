package ru.job4j.basics.loops;

/*
  Выведите на консоль числа от 0 до N. N не входит. В этом упражнении
  используйте цикл for c index.
*/
public class Print0ToN {
    public static void out(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        out(3);
    }
}
