package ru.job4j.basics.datatypes;

import java.util.Locale;

/**
 * Класс {@code Task17} представляет утилиту
 * для вычисления площади и периметра прямоугольника.
 *
 * <p>Содержит метод вычисления площади по формуле {@code 0.5 * base * height}
 * и периметра по формуле {@code 2 * (base + height)}
 * с выводом результата на консоль.</p>
 *
 * <p>Примеры использования: вызов метода расчета
 * с заданными значениями основания и высоты
 * и вывод результатов вычислений.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task17 {

    /**
     * Вычисляет площадь и периметр прямоугольника
     * и выводит результаты на консоль.
     *
     * <p>Площадь вычисляется по формуле {@code 0.5 * base * height},
     * периметр — по формуле {@code 2 * (base + height)}.
     * Результаты выводятся с точностью до одного знака после запятой.</p>
     *
     * @param base основание прямоугольника
     * @param height высота прямоугольника
     */
    public static void calculate(int base, int height) {
        double area = 0.5 * base * height;
        double perimeter = 2 * (base + height);
        System.out.printf(Locale.US, "%.1f%n%.1f", area, perimeter);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует работу метода {@link #calculate(int, int)}
     * на примере значений основания и высоты.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        calculate(3, 3);
    }
}
