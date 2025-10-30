package ru.job4j.basics.branching;

/*
  Чтобы проверить, что первое число меньше второго в Java используется оператор
  "<".

  Результат вычисления оператора "<" будет переменная типа boolean.

  Пример.

  boolean result = first < second;

  Допишите программу приведенную ниже. Программа должна вернуть истина, если
  первое число меньше второго.
*/
public class LessThen {
    public static boolean check(int first, int second) {
        return first < second;
    }

    public static void main(String[] args) {
        System.out.println(check(1, 2));
    }
}
