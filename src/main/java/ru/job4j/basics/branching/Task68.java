package ru.job4j.basics.branching;

/*
  Ниже представлен метод isTriangle(int a, int b, int c), который принимает 3
  целых числа - длины сторон треугольника.

  Задание: Написать код, который проверяет, являются ли эти числа длинами одного
  и того же треугольника, и выводит в консоль "Да", если являются, и "Нет", если
  не являются.

  Примечание: Если каждая сторона треугольника меньше суммы двух других сторон,
  значит треугольник существует.

  Например, для чисел 2, 5, 8 вывод будет:

  Нет
*/
public class Task68 {
    public static void isTriangle(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isTriangle(2, 5, 8);
    }
}
