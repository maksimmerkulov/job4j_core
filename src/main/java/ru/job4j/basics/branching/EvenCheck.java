package ru.job4j.basics.branching;

/*
  Для проверки, что два числа равны друг другу используется оператор ==. В
  данной задаче нужно проверить, что переданное число является четным.

  Для проверки используйте операторы % и ==.
*/
public class EvenCheck {
    public static boolean check(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(check(2));
    }
}
