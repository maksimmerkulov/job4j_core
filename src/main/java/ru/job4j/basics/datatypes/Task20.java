package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task20} представляет инструмент
 * для разложения двузначного числа на десятки и единицы.
 *
 * <p>Содержит метод {@link #separate(int)}, который вычисляет
 * количество десятков и единиц числа и выводит результат на консоль.</p>
 *
 * <p>Пример использования: вызов метода {@code separate(20)}
 * выведет {@code 2 0}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task20 {

    /**
     * Разделяет двузначное число на десятки и единицы.
     *
     * <p>Метод принимает целое число, вычисляет количество десятков и единиц
     * и выводит их через пробел на консоль.</p>
     *
     * @param number двузначное число
     */
    public static void separate(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        System.out.println(num1 + " " + num2);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link #separate(int)}.
     * В качестве примера используется число {@code 20}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        separate(20);
    }
}
