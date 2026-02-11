package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task18} представляет вычисление суммы разрядов числа.
 *
 * <p>Содержит метод для формирования числа из разрядов десятков,
 * сотен и тысяч.</p>
 *
 * <p>Примеры использования: вызов метода {@code capSum}
 * с передачей значений разрядов и вывод результата на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task18 {

    /**
     * Вычисляет число по разрядам десятков, сотен и тысяч.
     *
     * <p>Каждый аргумент умножается на соответствующий разряд
     * и суммируется в итоговое значение.</p>
     *
     * @param tens количество десятков
     * @param hundreds количество сотен
     * @param thousands количество тысяч
     * @return итоговое число, составленное из разрядов
     */
    public static int capSum(int tens, int hundreds, int thousands) {
        int sum = tens * 10 + hundreds * 100 + thousands * 1000;
        return sum;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@code capSum}.</p>
     * <p>Вычисляет число из разрядов и выводит результат на консоль.</p>
     *
     * @param args аргументы командной строки (не используется)
     */
    public static void main(String[] args) {
        int sum = capSum(1, 2, 3);
        System.out.println(sum);
    }
}
