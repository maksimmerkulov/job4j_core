package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task30} представляет утилиту
 * для вычисления разницы между цифрами двузначного числа.
 *
 * <p>Содержит метод {@link #difference(int)},который принимает
 * двузначное число, вычисляет модуль разницы между десятками и единицами
 * и выводит результат на консоль.</p>
 *
 * <p>Примеры использования: вызов метода {@link #difference(int)}
 * с числом {@code 25}, результат выводится на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task30 {

    /**
     * Вычисляет модуль разницы между цифрами двузначного числа
     * и выводит результат.
     *
     * <p>Используются операции деления, остатка
     * и метод {@link Math#abs(int)}.</p>
     *
     * @param number положительное двузначное число
     *               (от {@code 10} до {@code 99})
     */
    public static void difference(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        System.out.println(Math.abs(num1 - num2));
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
        difference(25);
    }
}
