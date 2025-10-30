package ru.job4j.basics.branching;

/*
  Для проверки, что два числа НЕ равны друг другу используется оператор !=. В
  данной задаче нужно проверить, что переданное число является НЕ четным.

  Для проверки используйте операторы % и !=.
*/
public class OddCheck {
    public static boolean check(int num) {
        return num % 2 != 0;
    }

    public static void main(String[] args) {
        System.out.println(check(2));
    }
}
