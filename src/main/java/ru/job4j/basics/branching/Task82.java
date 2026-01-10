package ru.job4j.basics.branching;

/*
  Ниже представлен метод isEquals(String first, String second), который
  принимает 2 строки.

  Задание: Написать код, который определяет, являются ли эти строки идентичными.
  Вывести в консоль "Да", если являются, и "Нет", если не являются.
*/
public class Task82 {
    public static boolean isEquals(String first, String second) {
        boolean result = first.equals(second);
        System.out.println(result ? "Да" : "Нет");
        return result;
    }

    public static void main(String[] args) {
        isEquals("John", "John");
    }
}
