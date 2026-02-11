package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task22} предназначен
 * для разложения двузначного числа на цифры десятков и единиц.
 *
 * <p>Содержит метод {@link #separate(int)}, который выводит
 * цифры числа в обратном порядке — сначала единицы, затем десятки.</p>
 *
 * <p>Примеры использования: передать число в метод {@code separate}
 * и вывести цифры на консоль в обратном порядке.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task22 {

    /**
     * Разделяет двузначное число на цифры десятков и единиц
     * и выводит их в обратном порядке.
     *
     * <p>Сначала выводится цифра единиц, затем цифра десятков.</p>
     *
     * @param number двузначное число
     */
    public static void separate(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        System.out.println(num2 + " " + num1);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link #separate(int)}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        separate(20);
    }
}
