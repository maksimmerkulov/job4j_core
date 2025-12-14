package ru.job4j.basics.branching;

/*
  Ниже представлен метод isTriangle(int a, int b, int c), который принимает 3
  целых положительных числа.

  Задание: Написать код, который проверяет, являются ли эти числа сторонами
  треугольника, то есть из них возможно составить треугольник.

  Вывести в консоль "Да", если являются, или "Нет", если не являются.

  Примечание: Треугольник существует только тогда, когда ни одна из его сторон
  не превышает сумму двух других.

  Например, для чисел 7, 2, 2 вывод будет:

  Нет
*/
public class Task56 {
    public static void isTriangle(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isTriangle(7, 2, 2);
    }
}
