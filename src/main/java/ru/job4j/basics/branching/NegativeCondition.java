package ru.job4j.basics.branching;

/**
 * Класс {@code NegativeCondition} демонстрирует работу логических выражений
 * для проверки положительности и отрицательности числа.
 *
 * <p>Содержит примеры использования операторов сравнения: {@code <} и {@code >}
 * для целых чисел.</p>
 *
 * <p>Пример использования: создается переменная {@code num}, затем проверяется,
 * является ли она отрицательной или положительной, и результаты выводятся
 * на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class NegativeCondition {

    /**
     * Точка входа в программу.
     *
     * <p>Создает целое число {@code num} и два логических выражения:
     * первое проверяет, что число отрицательное, второе — что положительное.
     * Результаты выводятся на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        int num = -1;
        boolean result1 = num < 0;
        boolean result2 = num > 0;
        System.out.println(result1);
        System.out.println(result2);
    }
}
