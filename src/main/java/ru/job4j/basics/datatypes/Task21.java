package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task21} представляет инструмент
 * для разложения трехзначного числа на отдельные цифры.
 *
 * <p>Содержит метод {@link #separate(int)}, который принимает трехзначное число
 * и выводит цифры сотен, десятков и единиц через пробел на консоль.</p>
 *
 * <p>Пример использования: разложение числа {@code 205} на цифры
 * {@code 2}, {@code 0} и {@code 5}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task21 {

    /**
     * Разделяет трехзначное число на цифры сотен, десятков и единиц.
     *
     * <p>Цифры выводятся на консоль через пробел в порядке: сотни, десятки,
     * единицы.</p>
     *
     * @param number трехзначное число
     */
    public static void separate(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number / 10) % 10;
        num3 = number % 10;
        System.out.println(num1 + " " + num2 + " " + num3);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link #separate(int)}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        separate(205);
    }
}
