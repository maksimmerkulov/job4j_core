package ru.job4j.basics.datatypes;

/**
 * Класс {@code MathSqrt} демонстрирует вычисление квадратного корня числа
 * с помощью метода {@link Math#sqrt(double)}.
 *
 * <p>Содержит единственный метод {@code main}, который вычисляет
 * квадратный корень числа {@code 9} и выводит результат на консоль.</p>
 *
 * <p>Примеры использования: запуск программы выводит на консоль
 * значение квадратного корня числа {@code 9}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MathSqrt {

    /**
     * Точка входа в программу.
     *
     * <p>Вычисляет квадратный корень числа {@code 9}
     * и выводит результат на консоль
     * с точностью до одного знака после запятой.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        double result = Math.sqrt(9);
        System.out.println(result);
    }
}
