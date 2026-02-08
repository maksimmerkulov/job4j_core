package ru.job4j.basics.console;

import java.util.Locale;
import java.util.Scanner;

/**
 * Класс {@code Task18} вычисляет периметр квадрата, длину окружности
 * и площадь круга по введенным значениям.
 *
 * <p>Содержит единственный метод {@code main}, который считывает
 * сторону квадрата и радиус круга, затем выводит периметр квадрата,
 * длину окружности и площадь круга
 * с точностью до одного знака после запятой.</p>
 *
 * <p>Примеры использования: запуск программы, ввод значений
 * и получение на стандартном выводе результата вычислений.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task18 {

    /**
     * Точка входа в программу.
     *
     * <p>Считывает сторону квадрата и радиус круга,
     * вычисляет периметр квадрата, длину окружности и площадь круга
     * и выводит результаты на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
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
