package ru.job4j.basics.branching;

/*
  Ниже представлен метод isEquals(int a1, int a2, int b1, int b2), который
  принимает 2 пары целых чисел: a1, a2 - числитель и знаменатель первой дроби, и
  b1, b2 - числитель и знаменатель второй дроби соответственно.

  Задание: Написать код, который проверяет, равны ли эти дроби друг другу, и
  выводит в консоль "Да", если равны, и "Нет", если не равны.

  Например, вывод для чисел 2, 5, 6, 15 будет: Да
*/
public class Task52 {
    public static void isEquals(int a1, int a2, int b1, int b2) {
        if (a1 * b2 == b1 * a2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isEquals(2, 5, 6, 15);
    }
}
