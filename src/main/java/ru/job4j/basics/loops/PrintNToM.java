package ru.job4j.basics.loops;

/*
  Выведите на консоль числа от N до M. M не входит. В этом упражнении
  используйте цикл for c index.
*/
public class PrintNToM {
    public static void out(int n, int m) {
        for (int i = n; i < m; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        out(2, 4);
    }
}
