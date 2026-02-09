package ru.job4j.basics.datatypes;

/**
 * Класс {@code IntegerTypeConversion} демонстрирует
 * неявное и явное преобразование целочисленных типов.
 *
 * <p>Содержит единственный метод {@code main}, который показывает
 * расширяющее преобразование типа {@code int} в {@code long}
 * и сужающее преобразование типа {@code int} в {@code short}.</p>
 *
 * <p>Примеры использования: запуск программы выводит на консоль
 * результат преобразования значения {@code int}
 * в типы {@code long} и {@code short}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class IntegerTypeConversion {

    /**
     * Точка входа в программу.
     *
     * <p>Выполняет неявное преобразование {@code int} в {@code long}
     * и явное преобразование {@code int} в {@code short},
     * после чего выводит результаты на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        int num = 1;
        long numUpper = num;
        short numLower = (short) num;
        System.out.println(numUpper);
        System.out.println(numLower);
    }
}
