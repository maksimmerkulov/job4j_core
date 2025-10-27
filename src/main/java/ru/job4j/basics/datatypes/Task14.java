package ru.job4j.basics.datatypes;

import java.util.Locale;
import java.util.Scanner;

/*
  Формула расчета периметра треугольника (любого) : P = a + b + c, где P -
  периметр, a - катет1, b - катет2, с - гипотенуза.

  Формула расчета площади прямоугольного треугольника: S = 1/2 (a * b), где S -
  площадь, a - катет1, b - катет2.

  Задание: написать код, рассчитывающий периметр и площадь прямоугольного
  треугольника.

  Значения катета1, катета2 и гипотенузы принимаются вводом с клавиатуры с
  помощью класса Scanner в виде дробного числа (double), то есть входные данные
  не ограничиваются только целыми числами.

  Примечания: для удобства команда System.out.printf("%.1f%n%.1f", perimeter,
  area); выводит на печать полученное значение с округлением до одного символа
  после запятой.

  Для тех, кто будет тестировать код вне этого задания и вводить данные вручную:

  - Быстро рассчитать гипотенузу можно на онлайн-калькуляторе:
    https://www.center-pss.ru/math/gipotenuza.htm

  - Входные данные для простоты округляем до одного символа после запятой.
    Например, "5 7 8.6".
*/
public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        double cathetA = input.nextDouble();
        double cathetB = input.nextDouble();
        double hypotenuse = input.nextDouble();
        double perimeter = cathetA + cathetB + hypotenuse;
        double area = (cathetA * cathetB) / 2;
        System.out.printf(Locale.US, "%.1f%n%.1f", perimeter, area);
    }
}
