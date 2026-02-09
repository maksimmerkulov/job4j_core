package ru.job4j.basics.datatypes;

/**
 * Класс {@code MathPow} демонстрирует
 * использование метода {@link Math#pow(double, double)}
 * для возведения числа в степень.
 *
 * <p>Содержит единственный метод {@code main}, который вычисляет
 * квадрат числа {@code 3} и выводит результат на консоль.</p>
 *
 * <p>Примеры использования: запуск программы выводит
 * результат вычисления {@code 3^2} на стандартный вывод.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MathPow {

    /**
     * Точка входа в программу.
     *
     * <p>Вычисляет квадрат числа {@code 3}
     * с помощью метода {@link Math#pow(double, double)}
     * и выводит результат на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        double result = Math.pow(3, 2);
        System.out.println(result);
    }
}
