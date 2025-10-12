package ru.job4j.basics.console;

import java.util.Locale;
import java.util.Scanner;

/*
  Дана сторона квадрата a. Найти его периметр.

  Дан радиус окружности r. Найти длину окружности и площадь круга.*

  Результат каждого вычисления выводите в новой строке с точностью до десятых.

    *при расчётах используйте вызов Math.PI
*/
public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        double perimeter = 4 * a;
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r;
        System.out.printf(Locale.US, "%.1f%n", perimeter);
        System.out.printf(Locale.US, "%.1f%n", circumference);
        System.out.printf(Locale.US, "%.1f%n", area);
    }
}
