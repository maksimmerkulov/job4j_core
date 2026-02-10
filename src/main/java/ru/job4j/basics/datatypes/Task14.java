package ru.job4j.basics.datatypes;

import java.util.Locale;
import java.util.Scanner;

/**
 * Класс {@code Task14} рассчитывает периметр и площадь
 * прямоугольного треугольника по длинам катетов и гипотенузы.
 *
 * <p>Программа считывает с консоли три числа: длины катетов и гипотенузы,
 * затем вычисляет периметр и площадь треугольника
 * и выводит результаты с одной цифрой после запятой.</p>
 *
 * <p>Примеры использования: пользователь вводит значения катетов и гипотенузы,
 * программа выводит периметр и площадь.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task14 {

    /**
     * Точка входа в программу.
     *
     * <p>Считывает длины катетов и гипотенузы с консоли,
     * затем вычисляет периметр и площадь прямоугольного треугольника
     * и выводит результаты с одной цифрой после запятой.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
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
