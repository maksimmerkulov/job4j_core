package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task31} представляет утилиту
 * для вычисления выражения на основе цифр трехзначного числа.
 *
 * <p>Содержит метод {@link #difference(int)}, который вычисляет
 * модуль разницы между первой и последней цифрой числа,
 * умноженный на среднюю цифру, и выводит результат на консоль.</p>
 *
 * <p>Примеры использования: вызов метода {@link #difference(int)}
 * с числом {@code 235}, результат выводится на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task31 {

    /**
     * Вычисляет модуль выражения {@code (сотни − единицы) * десятки}
     * и выводит результат на консоль.
     *
     * <p>Используются операции деления, остатка
     * и метод {@link Math#abs(int)}.</p>
     *
     * @param number положительное трехзначное число
     *               (от {@code 100} до {@code 999})
     */
    public static void difference(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number / 10) % 10;
        num3 = number % 10;
        System.out.println(Math.abs((num1 - num3) * num2));
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link #difference(int)}.</p>
     * <p>Создает пример числа и выводит результат на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        difference(235);
    }
}
