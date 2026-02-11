package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task24} представляет утилиту
 * для разложения целого положительного двузначного числа на десятки и единицы.
 *
 * <p>Содержит метод для вычисления десятков и единиц числа
 * и вывода результата на консоль.</p>
 *
 * <p>Примеры использования: вызов метода {@code separate}
 * для вывода разложения числа на составляющие.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task24 {

    /**
     * Разделяет число на десятки и единицы и выводит результат.
     *
     * <p>Десятки вычисляются как число без последней цифры,
     * единицы — как остаток от деления на {@code 10}.</p>
     *
     * @param number двузначное число
     */
    public static void separate(int number) {
        int num1, num2;
        num1 = number - (number % 10);
        num2 = number % 10;
        System.out.println(num1 + "+" + num2);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@code separate}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        separate(34);
    }
}
