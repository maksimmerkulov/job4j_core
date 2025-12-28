package ru.job4j.basics.branching;

/*
  Ниже представлен метод isTriangle(int a, int b, int c), который принимает 3
  целых числа - углы треугольника.

  Задание: Написать код, который проверяет, являются ли эти числа углами одного
  и того же треугольника, и выводит в консоль "Да", если являются, и "Нет", если
  не являются.

  Примечание: Сумма углов в треугольнике равна 180 градусам.

  Например, для чисел 60, 60, 70 вывод будет:

  Нет
*/
public class Task67 {
    public static void isTriangle(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0 && a + b + c == 180) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isTriangle(60, 60, 70);
    }
}
