package ru.job4j.basics.branching;

/*
  Чтобы проверить, что оба выражения являются истинными нужно использовать &&.
  Синтаксис

  выражение1 && выражение2

  В данной задаче вам нужно проверить, что переданное число положительно И четное.
*/
public class LogicAnd {
    public static boolean check(int num) {
        return num > 0 && num % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(check(-1));
    }
}
