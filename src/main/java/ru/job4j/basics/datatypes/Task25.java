package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task25} представляет разложение трехзначного числа
 * на сотни, десятки и единицы.
 *
 * <p>Содержит метод для вывода числа в полном виде:
 * сотни + десятки + единицы.</p>
 *
 * <p>Примеры использования: разложение числа {@code 345}
 * на составляющие {@code 300+40+5}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task25 {

    /**
     * Разделяет трехзначное число на сотни, десятки и единицы
     * и выводит результат на консоль.
     *
     * <p>Используются операции деления и вычисления остатка.</p>
     *
     * @param number трехзначное положительное число
     */
    public static void separate(int number) {
        int num1, num2, num3;
        num1 = number - (number % 100);
        num2 = (number % 100) - (number % 10);
        num3 = number % 10;
        System.out.println(num1 + "+" + num2 + "+" + num3);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует работу метода {@link Task25#separate(int)}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        separate(345);
    }
}
