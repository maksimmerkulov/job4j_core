package ru.job4j.basics.datatypes;

/**
 * Класс {@code MathAbs} демонстрирует вычисление модуля числа
 * с помощью метода {@link Math#abs(double)}.
 *
 * <p>Содержит единственный метод {@code main}, который вычисляет
 * модуль числа {@code -5} и выводит результат на консоль.</p>
 *
 * <p>Примеры использования: запуск программы выводит на консоль
 * значение модуля числа {@code -5}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MathAbs {

    /**
     * Точка входа в программу.
     *
     * <p>Вычисляет модуль числа {@code -5} и выводит результат на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        double result = Math.abs(-5);
        System.out.println(result);
    }
}
