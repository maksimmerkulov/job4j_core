package ru.job4j.basics.branching;

/*
  Ниже представлен метод isIdentical(char s1, char s2), который принимает 2
  символьных значения.

  Задание: Написать код, который проверяет идентичность этих значений.
*/
public class Task80 {
    public static boolean isIdentical(char s1, char s2) {
        return s1 == s2;
    }

    public static void main(String[] args) {
        boolean result = isIdentical('A', 'A');
        System.out.println("Символы идентичны? " + result);
    }
}
